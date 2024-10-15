-- Valid. _5abc and dataField are valid identifiers.
SELECT
    _5abc.dataField
FROM
    _5abc;

-- Valid. `5abc` and dataField are valid identifiers.
SELECT
    `5abc`.dataField
FROM
    `5abc`;

-- Valid. abc5 and dataField are valid identifiers.
SELECT
    abc5.dataField
FROM
    abc5;

-- Valid. `GROUP` and dataField are valid identifiers.
SELECT
    `GROUP`.dataField
FROM
    `GROUP`;

-- Valid. abc5 and GROUP are valid identifiers.
SELECT
    abc5.ABORT
FROM
    abc5;

SELECT
    *
FROM
    hello;

SELECT
    *
FROM
    (
        SELECT
            "apple" AS fruit,
            "carrot" AS vegetable
    );

WITH groceries AS (
    SELECT
        "milk" AS dairy,
        "eggs" AS protein,
        "bread" AS grain
)
SELECT
    g.*
FROM
    groceries AS g;

WITH orders AS (
    SELECT
        5 as order_id,
        "sprocket" as item_name,
        200 as quantity
)
SELECT
    * REPLACE (quantity / 2 AS quantity)
FROM
    orders;