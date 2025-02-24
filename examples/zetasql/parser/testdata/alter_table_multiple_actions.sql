ALTER TABLE foo SET OPTIONS(opt_t = 1), ADD CONSTRAINT a_is_positive CHECK(a > 0) ENFORCED, ALTER CONSTRAINT bar ENFORCED,
  ALTER CONSTRAINT baz SET OPTIONS(opt_a = true);
ALTER TABLE foo SET OPTIONS(opt_a = true), ADD CHECK(a > 0) ENFORCED;
ALTER TABLE foo SET OPTIONS(opt_a = true), ALTER CONSTRAINT bar NOT ENFORCED;
ALTER TABLE foo SET OPTIONS(opt_a = true), ADD ROW DELETION POLICY(x > 1000);
ALTER TABLE foo ADD ROW DELETION POLICY(x > 1000), DROP ROW DELETION POLICY;
ALTER TABLE foo SET OPTIONS(opt_a = true), ALTER CONSTRAINT bar SET OPTIONS(opt_b = 1);
ALTER TABLE foo ADD CHECK(a > 0) ENFORCED, ALTER CONSTRAINT bar NOT ENFORCED;
ALTER TABLE foo ALTER CONSTRAINT bar NOT ENFORCED, ALTER CONSTRAINT bar SET OPTIONS(opt_a = 1);
ALTER TABLE foo ADD FOREIGN KEY(A) REFERENCES T(B) MATCH SIMPLE ON UPDATE NO ACTION ON DELETE NO ACTION ENFORCED,
  ADD CHECK(col_a > 0) ENFORCED;
ALTER TABLE foo ADD CONSTRAINT fk_A FOREIGN KEY(A) REFERENCES T(B) MATCH SIMPLE ON UPDATE NO ACTION ON DELETE NO ACTION ENFORCED,
  ALTER CONSTRAINT a_gt_zero NOT ENFORCED;
ALTER TABLE foo ADD CONSTRAINT fk_A FOREIGN KEY(A) REFERENCES T(B) MATCH SIMPLE ON UPDATE NO ACTION ON DELETE NO ACTION ENFORCED,
  DROP CONSTRAINT a_gt_zero;
