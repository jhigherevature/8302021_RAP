-- single-line comments

/*
 * Multi-line comments in SQL
 */
-- Drop statement
--DROP SCHEMA IF EXISTS examples CASCADE;

-- Create a new Schema
--CREATE SCHEMA examples;
/*
 * When defining a table you can specify the schema using dot notation, as 
 * shown below:
 * 
 * CREATE TABLE <schema_name>.<table_name> (
 * 		<column_name> <column_datatype> [addl options...],
 * 		<column_name> <column_datatype> [addl options...],
 * 		<column_name> <column_datatype> [addl options...]
 * );
 */
CREATE TABLE examples.employees (
		emp_id INTEGER,
		emp_name VARCHAR(200),
		emp_title VARCHAR(100),
		emp_salary NUMERIC
);

/*
 * DML - Data Manipulation Language
 * 
 * Adding information: INSERT
 * 	syntax:
 * 		INSERT INTO (<schema_name>.)<table_name> VALUES (<value_1> ...);
 */
INSERT INTO employees VALUES (1000,'Joseph','CEO',null);
INSERT INTO employees VALUES (1001,'Bin','Developer',120000.00);
INSERT INTO employees VALUES (1002,'Dan','Tester',123000.00);
INSERT INTO employees VALUES (1003,'Emmanuel','Developer',168000.00);
INSERT INTO employees VALUES (1004,'Jacob','Tester',195000.00);
INSERT INTO employees VALUES (1005,'Jessica','Developer',199000.00);
INSERT INTO employees VALUES (1006,'Steve','Developer',97000.00);
INSERT INTO employees VALUES (1007,'Maggie','Tester',88000.00);
INSERT INTO employees VALUES (1008,'Quincy','Developer',86000.00);
INSERT INTO employees VALUES (1009,'Leslie','Tester',151000.00);
INSERT INTO employees VALUES (1010,'Bill','Developer',114000.00);

/*
 * The 'WHERE' clause is an optional statement that you can add to your
 * UPDATE, DELETE and SELECT operations which allow you to specify the
 * modification/removal/search function you perform. Note that if we do
 * not apply the where clause to our statement, we will effect all records
 * within a particular table.
 */
--UPDATE examples.employees SET emp_salary=100000; -- UPDATE ALL ROWS TO have 100000 as the NEW salary
UPDATE examples.employees SET emp_salary=100000 WHERE emp_id=1000; -- ONLY UPDATE FIRST record


/*
 * DROP - DDL command which will allow for the removal of a database entity in
 * its entirety. If we drop a table, we will lose all of the data within that
 * table, and will need to re-define it.
 */ 
--DROP TABLE examples.EMPLOYEES;

/*
 * TRUNCATE - DDL (more traditionally : DML) command which allows you to remove
 *  all data within a table while retaining the structure of the table itself.
 */
--TRUNCATE examples.employees;
/*
 * RESTART IDENTITY allows you to reset any sequences (values that increase
 * over time) associated with your table. We will talk more about sequences
 * and triggers later...
 * 
 * Cannot append the WHERE clause to specify exact records
 */
--TRUNCATE examples.employees RESTART IDENTITY;
--TRUNCATE examples.employees CONTINUE IDENTITY; -- default : do NOT reset sequences

/*
 * DELETE - DML Command that allows you to delete records from a table without
 * manipulating the structure of the table in its entirety.
 * 
 * Cannot Restart/continue identity
 * 
 * The delete will remove records from our table one-row-at-a-time
 * Syntax:
 * DELETE FROM <table_name> [WHERE...]
 */
--DELETE FROM examples.employees;
DELETE FROM examples.EMPLOYEES WHERE EMP_ID=1010;