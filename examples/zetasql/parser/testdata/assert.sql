ASSERT TRUE;
ASSERT(5 + a);
ASSERT(
  SELECT
    1
) = 1 AS "simple test";
ASSERT NOT EXISTS(
  SELECT
    1
);
ASSERT @param = 1 AS "param test";
ASSERT @@sysvar = 1 AS "sysvar test";
ASSERT "123" IN ("123", "456");
ASSERT IS_NAN(NULL) OR ENDS_WITH("suffix", "fix") AS "abc";
ASSERT "123" IS NOT NULL;
ASSERT CASE TRUE
  WHEN TRUE THEN FALSE
END;
ASSERT 123 BETWEEN 1 AND 456;
ASSERT(
  SELECT
    IS_NAN(NAN)
);
ASSERT(ASSERT((
    SELECT
      TRUE
  )));
