/*
 * Aggregate Functions : Operations that are performed across multiple
 * rows (or every single row) of your records based on a specified column
 */
SELECT AVG(emp_salary) FROM EXAMPLES.EMPLOYEES;
SELECT COUNT(emp_id) FROM EXAMPLES.EMPLOYEES;

/*
 * SCALAR FUNCTIONS : Operations which are performed on a record-by-record
 * basis across a column of our resultset that we specify
 */ 
-- STRING FUNCTIONS:
SELECT UPPER(emp_name) FROM EXAMPLES.EMPLOYEES;
SELECT CHAR_LENGTH(emp_name) FROM EXAMPLES.EMPLOYEES; 
/*
 * anytime we want to perform an operation on our database that provides
 * data to us, we use a SELECT statement (or call some custom created procedures)
 */ 
SELECT ('Hello ' || 'World'); -- String concatenation in SQL, we use ' || '


-- Mathematical Functions:
SELECT ABS(emp_salary) FROM EXAMPLES.EMPLOYEES;
SELECT ABS(-175);

/*
 * An alias acts as a moniker/psuedonym that we can apply to an entity
 * including tables, columns, the result of functions, etc... to cut down
 * on the redundancy within a search query or to label a result-set using
 * different naming that the tables of your database
 * 
 * Alias can provide clarity, as well as some light security features when used
 */ 
SELECT ABS(emp_salary) AS average FROM EXAMPLES.EMPLOYEES;
SELECT emp_title FROM EXAMPLES.EMPLOYEES E;
