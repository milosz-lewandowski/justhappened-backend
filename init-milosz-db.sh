#!/bin/bash
set -e

psql -v ON_ERROR_STOP=1 --username "$POSTGRES_USER" --dbname "$POSTGRES_DB" <<-EOSQL
#    CREATE USER postgres;
    CREATE DATABASE miloszdb;
    GRANT ALL PRIVILEGES ON DATABASE miloszdb TO postgres;
EOSQL
