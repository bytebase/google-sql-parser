DELETE T;
DELETE x.T
WHERE
  true;
DELETE T WITH OFFSET AS offset
WHERE
  true;
DELETE a.b.c
WHERE
  c = y
ASSERT_ROWS_MODIFIED 10;
DELETE T
ASSERT_ROWS_MODIFIED CAST(@param1 AS int64);
DELETE T
ASSERT_ROWS_MODIFIED CAST(@@sysvar AS int64);
DELETE T
WHERE
  1 + (
    SELECT
      count(*)
    FROM
      T2
  ) = 5
ASSERT_ROWS_MODIFIED @row_count;
DELETE T.(a.b).c
WHERE
  true;
DELETE T.a[0].b
WHERE
  true;
DELETE T AS a
WHERE
  a.x = 1;
@{ a = b }
DELETE t1;
