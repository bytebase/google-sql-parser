CREATE EXTERNAL SCHEMA foo WITH CONNECTION bar.baz
OPTIONS();
CREATE EXTERNAL SCHEMA foo WITH CONNECTION DEFAULT
OPTIONS();
CREATE EXTERNAL SCHEMA foo WITH CONNECTION bar.baz
OPTIONS();
CREATE EXTERNAL SCHEMA `WITH CONNECTION` WITH CONNECTION bar.baz
OPTIONS();
CREATE OR REPLACE EXTERNAL SCHEMA IF NOT EXISTS foo.bar WITH CONNECTION baz
OPTIONS();
CREATE EXTERNAL SCHEMA foo WITH CONNECTION bar.baz
OPTIONS(a = b, c = "def");
CREATE PRIVATE EXTERNAL SCHEMA foo WITH CONNECTION bar
OPTIONS();
CREATE EXTERNAL SCHEMA foo
OPTIONS();
