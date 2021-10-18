/*
 * DDL : Data Definition Language - (When we create anything structurally
 * 		for our DB)
 * 
 * DCL : Data Control Language : Provide permissions to perform certain actions
 * 		across values in our DB, across schemas and tables 		
 * 
 * GRANT : provide certain privileges to a user
 * 		GRANT <option> ON <schem_name>.<table_name> TO <user_name>
 * REVOKE : remove certain privileges from a user
 * 		REVOKE <option> ON <table> IN SCHEMA <schema_name> FROM <user_name>
 */

-- This creates a USER that can specifically access records in your
-- database (this is associated with a DB connection)
-- DDL for User:
CREATE USER customers WITH PASSWORD 'password';

-- DCL: 
GRANT SELECT, UPDATE, INSERT, DELETE ON examples.employees TO customers;
GRANT ALL PRIVILEGES ON ALL TABLES IN SCHEMA examples TO customers;
--REVOKE ALL PRIVILEGES ON ALL TABLES IN SCHEMA examples FROM customers;
--REVOKE ALL PRIVILEGES ON examples.employees FROM customers;


/*
 * Sequences and Functions:
 * 
 * GRANT USAGE ON ALL SEQUENCES IN SCHEMA examples TO customers;
 * GRANT EXECUTE ON ALL FUNCTIONS IN SCHEMA examples TO customers;
 */ 
