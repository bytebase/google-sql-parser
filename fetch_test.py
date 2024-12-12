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
    # return the last non-empty line
    lines = block.split("\n")
    for line in reversed(lines):
        if line != "":
            return line


if __name__ == "__main__":
    filepaths = [
        "zetasql/parser/testdata/alter_column_set_drop_default.test",
        "zetasql/parser/testdata/alter_column_type.test",
        "zetasql/parser/testdata/alter_row_access_policy.test"
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
