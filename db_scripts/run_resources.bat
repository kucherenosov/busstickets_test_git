rem @echo off

set NLS_LANG=AMERICAN
set DB_NAME=testdb
set PGPASSWORD=password
set PGUSER=postgres

psql -d %DB_NAME% -p 5432 -f insert_resources.sql 