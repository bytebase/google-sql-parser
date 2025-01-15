"""
fetch_test.py fetches the test from zetasql repository, and remove the syntax error statement.
"""

import urllib.request
import io
import os


def fetch_file(file_path: str) -> str:
    url = (
        "https://raw.githubusercontent.com/google/zetasql/refs/heads/master/"
        + file_path
    )
    page = urllib.request.urlopen(url)
    return page.read().decode("utf-8")


def extract_valid_statement_from_page(content: str) -> list[str]:
    lines = content.split("\n")
    block_buf = io.StringIO()
    ret = []
    for line in lines:
        if line == "==":
            # Block ended, check the block is valid.
            block = block_buf.getvalue()
            block_buf = io.StringIO()
            valid_statement = extract_valid_statement_from_block(block)
            if valid_statement != "":
                ret.append(valid_statement)
        else:
            block_buf.write(line + "\n")
    return ret


def extract_valid_statement_from_block(block: str) -> str:
    if "ERROR" in block:
        return ""
    # skip the empty line, and read reversely until meet '--'
    lines = block.split("\n")
    valid_statement_lines = []
    for line in reversed(lines):
        if line == "":
            continue
        if line == "--":
            break
        if line != "":
            valid_statement_lines.append(line)
    return "\n".join(reversed(valid_statement_lines))


if __name__ == "__main__":
    filepaths = [
        # alter_statement
        "zetasql/parser/testdata/alter_column_set_drop_default.test",
        "zetasql/parser/testdata/alter_column_type.test",
        "zetasql/parser/testdata/alter_row_access_policy.test",
        "zetasql/parser/testdata/alter_set_options.test",
        "zetasql/parser/testdata/alter_table_add_check_constraint.test",
        "zetasql/parser/testdata/alter_table_add_column.test",
        "zetasql/parser/testdata/alter_table_add_foreign_key.test",
        "zetasql/parser/testdata/alter_table_alter_constraint.test",
        "zetasql/parser/testdata/alter_table_drop_column.test",
        "zetasql/parser/testdata/alter_table_drop_constraint.test",
        "zetasql/parser/testdata/alter_table_multiple_actions.test",
        "zetasql/parser/testdata/alter_table_rename_to.test",
        "zetasql/parser/testdata/alter_table_ttl.test",
        # analyze_statement
        "zetasql/parser/testdata/analyze.test",
        # assert_statement
        "zetasql/parser/testdata/assert.test",
        # clone_data_statement
        "zetasql/parser/testdata/clone_data.test",
        # dml_statement
        "zetasql/parser/testdata/dml_insert.test",
        "zetasql/parser/testdata/dml_insert_on_conflict_clause.test",
        "zetasql/parser/testdata/dml_delete.test",
        "zetasql/parser/testdata/dml_update.test",
        # merge_statement
        "zetasql/parser/testdata/dml_merge.test",
        # truncate_statement
        "zetasql/parser/testdata/truncate.test",
        # begin, commit, set statement
        "zetasql/parser/testdata/transaction.test",
        # begin_batch, run_batch, abort_batch statement
        "zetasql/parser/testdata/batch.test",
        # create_constant_statement
        "zetasql/parser/testdata/create_constant.test",
        # create_database_statement
        "zetasql/parser/testdata/create_database.test",
        # create_function_statement
        "zetasql/parser/testdata/create_function.test",
        # create_procedure_statement
        "zetasql/parser/testdata/create_procedure.test",
        # create_index_statement
        "zetasql/parser/testdata/create_index.test",
        # create_row_access_policy_statement
        "zetasql/parser/testdata/create_row_access_policy.test",
        # create_external_table_statement
        "zetasql/parser/testdata/create_external_table.test",
        # create_model_statement
        "zetasql/parser/testdata/create_model.test",
        # create_schema_statement
        "zetasql/parser/testdata/create_schema.test",
        # create_external_schema_statement
        "zetasql/parser/testdata/create_external_schema.test",
        # create_table_as_select
        "zetasql/parser/testdata/create_table_as_select.test",
        # create_view_statement
        "zetasql/parser/testdata/create_view.test",
        # define_table_statement
        "zetasql/parser/testdata/define_table.test",
        # describe_statement
        "zetasql/parser/testdata/describe.test",
        # execute_immediate
        "zetasql/parser/testdata/execute_immediate.test",
        # export_data
        "zetasql/parser/testdata/export_data.test",
        # export_model
        "zetasql/parser/testdata/export_model.test",
        # grant_and_revoke_statement
        "zetasql/parser/testdata/grant_and_revoke.test",
        # rename_statement
        "zetasql/parser/testdata/rename.test",
        # show_statement
        "zetasql/parser/testdata/show.test",
        # drop_statement
        "zetasql/parser/testdata/drop.test",
        "zetasql/parser/testdata/drop_function.test",
        "zetasql/parser/testdata/drop_row_access_policy.test",
    ]
    for filepath in filepaths:
        content = fetch_file(filepath)
        valid_statements = extract_valid_statement_from_page(content)
        # Write the valid statement into the corresponding file, if the file does not exist, create it.
        path_items = filepath.split("/")
        pretty_name = path_items[-1].replace(".test", ".sql")
        path_items[-1] = pretty_name
        pretty_path = "examples/" + "/".join(path_items)
        directory = os.path.dirname(pretty_path)
        if not os.path.exists(directory):
            os.makedirs(directory)
        with open(pretty_path, "w") as f:
            for statement in valid_statements:
                # Append semi-colon if not exists
                if statement[-1] != ";":
                    statement += ";"
                f.write(statement + "\n")
