CREATE MODEL t1;
CREATE MODEL t1
INPUT(
  i1 INT64,
  i2 FLOAT64
)
OUTPUT(
  o1 BOOL
);
CREATE MODEL t1 REMOTE;
CREATE MODEL t1 WITH CONNECTION conn_1;
CREATE MODEL t1 WITH CONNECTION DEFAULT;
CREATE MODEL t1 REMOTE WITH CONNECTION conn_1;
CREATE MODEL t1 OPTIONS(abc = def);
CREATE MODEL t1 AS
SELECT
  *
FROM
  t2;
CREATE MODEL t1 TRANSFORM(
  *)
AS
SELECT
  *
FROM
  t2;
CREATE MODEL t1 TRANSFORM(
  * EXCEPT (a, b),
  c)
AS
SELECT
  *
FROM
  t2;
CREATE MODEL t1 TRANSFORM(
  * REPLACE (a AS b))
AS
SELECT
  *
FROM
  t2;
CREATE MODEL t1 TRANSFORM(
  a AS label)
AS
SELECT
  *
FROM
  t2;
CREATE MODEL t1 TRANSFORM(
  a AS label)
AS
SELECT
  *
FROM
  t2;
CREATE MODEL t1 TRANSFORM(
  ml.`cross`(a, b) AS c)
AS
SELECT
  *
FROM
  t2;
CREATE MODEL t1 TRANSFORM(
  a,
  2 AS b)
AS
SELECT
  *
FROM
  t2;
CREATE PRIVATE MODEL pkg1.pkg2.`t 2` AS
SELECT
  1 AS a;
CREATE TEMP MODEL pkg1.pkg2.`t 2` AS
SELECT
  1
FROM
  t2
UNION ALL
SELECT
  2
FROM
  t3
  CROSS JOIN
  t4;
CREATE MODEL t3 AS
WITH
  tt AS (
    SELECT
      *
    FROM
      KeyValue
  )
SELECT
  *
FROM
  tt;
CREATE MODEL t4 OPTIONS(x = y) AS
WITH
  t1 AS (
    SELECT
      1
  ),
  t2 AS (
    SELECT
      2
  )
SELECT
  3;
CREATE MODEL t4 OPTIONS(x = y);
CREATE MODEL tt OPTIONS(x = 1) AS
SELECT
  1;
CREATE MODEL tt TRANSFORM(
  a AS b)
OPTIONS(x = 1) AS
SELECT
  1;
CREATE TEMP MODEL tt OPTIONS(x = 5, y = 'abc', z = @param, zz = ident, zzz = @@sysvar) AS
SELECT
  2;
CREATE MODEL tt OPTIONS() AS
SELECT
  2;
CREATE MODEL tt OPTIONS(x = 5.5, y = a, z = b.c) AS
SELECT
  2;
CREATE MODEL tt OPTIONS(y = 'b.c', z = `b.c`) AS
SELECT
  2;
CREATE MODEL options AS
SELECT
  1 AS x;
CREATE MODEL options OPTIONS(x = y) AS
SELECT
  1 AS x;
CREATE MODEL options OPTIONS(x = y) AS
SELECT
  1 AS x;
CREATE MODEL options OPTIONS(x = y) AS
SELECT
  1 AS x;
CREATE OR REPLACE MODEL xyz AS
(
SELECT
  1
);
CREATE MODEL IF NOT EXISTS xyz AS
(
SELECT
  1
);
CREATE OR REPLACE TEMP MODEL IF NOT EXISTS a.b.c OPTIONS(d = e) AS
SELECT
  1;
CREATE MODEL t AS
WITH
  q AS (
    SELECT
      1
  ),
  q2 AS (
    SELECT
      *
    FROM
      q
  )
SELECT
  *
FROM
  q2;
CREATE MODEL t1
INPUT(
  i1 INT64,
  i2 FLOAT64
)
OUTPUT(
  o1 BOOL
) REMOTE WITH CONNECTION conn_1 OPTIONS(abc = def);
CREATE MODEL t1
INPUT(
  i1 INT64,
  i2 FLOAT64
)
OUTPUT(
  o1 BOOL
) TRANSFORM(
  a,
  2 AS b)
REMOTE WITH CONNECTION conn_1 OPTIONS(abc = def) AS
SELECT
  *
FROM
  t2;
CREATE MODEL m AS
(
a1 AS (
  SELECT
    *
  FROM
    t1
));
CREATE MODEL m AS
(
a1 AS (
  SELECT
    *
  FROM
    t1
),
a2 AS (
  SELECT
    *
  FROM
    t2
));
CREATE MODEL m AS
(
SELECT
  *
FROM
  t1
);
CREATE MODEL m AS
(WITH
  a1 AS (
    SELECT
      *
    FROM
      t1
  )
SELECT
  *
FROM
  a1
);
