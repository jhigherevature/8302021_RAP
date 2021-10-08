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

