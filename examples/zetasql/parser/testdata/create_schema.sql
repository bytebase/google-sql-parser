CREATE SCHEMA foo;
CREATE OR REPLACE SCHEMA IF NOT EXISTS foo.bar
OPTIONS();
CREATE SCHEMA foo
OPTIONS(x = 'a', y = 'b');
CREATE OR REPLACE SCHEMA IF NOT EXISTS foo.bar DEFAULT COLLATE 'unicode:ci'
OPTIONS();
CREATE SCHEMA foo DEFAULT COLLATE 'unicode:ci'
OPTIONS(x = 'a', y = 'b');
CREATE SCHEMA foo DEFAULT COLLATE @@a
OPTIONS(x = 'a', y = 'b');
CREATE SCHEMA foo DEFAULT COLLATE ?
OPTIONS(x = 'a', y = 'b');
