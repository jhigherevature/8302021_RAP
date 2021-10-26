/*
 * Commonly when creating functional entities (functions, views, sequences, etc...)
 * the CREATE, OR and REPLACE keywords are used together:
 * CREATE OR REPLACE <entity> ...
 */
CREATE OR REPLACE FUNCTION count_emp_salary_range(
	min_sal INTEGER, max_sal INTEGER)
	RETURNS INTEGER AS 
	$$
	DECLARE 
		sal_count INTEGER;
	BEGIN 
		SELECT COUNT(*) INTO sal_count FROM examples.EMPLOYEES
		WHERE emp_salary BETWEEN min_sal AND max_sal;
		RETURN sal_count;		
	END
	$$ LANGUAGE PLPGSQL;
	
-- Use the select statement to call a function
SELECT count_emp_salary_range(90000, 160000);

/*
 * Creating Sequences allow for more control over the automatic
 * scaling of a value, typically used with ID (effectively our own
 * custom 'SERIAL')
 * 
 * Syntax:
 * 
 * CREATE [OR REPLACE] SEQUENCE <sequence_name> 
 * 	START WITH <value> INCREMENT | DECREMENT BY <amount>
 */
CREATE OR REPLACE SEQUENCE emp_id_seq START WITH 2000 INCREMENT BY 2;

CREATE OR REPLACE FUNCTION emp_id_func()
	RETURNS TRIGGER AS
$$ BEGIN
	IF NEW.emp_id IS NULL THEN
		NEW.emp_id:=NEXTVAL('emp_id_seq');
		RETURN NEW;
	END IF;
END;
$$ LANGUAGE PLPGSQL;

/*
 * Triggers : An entity that can perform some operation (typically invoking
 * a stored procedure or function) in response to another operation which
 * is called.  
 */
CREATE OR REPLACE TRIGGER emp_id_trig
BEFORE INSERT ON examples.EMPLOYEES
FOR EACH ROW 
EXECUTE FUNCTION emp_id_func();

-- This insert statement triggers the emp_id_trig, 
-- which in turn calls the emp_id_func()
INSERT INTO examples.employees VALUES (NULL, 'Rob', 'Developer', 97000);


-- USING SEQUENCES WITH DDL:
CREATE OR REPLACE SEQUENCE login_id_seq START WITH 10000 INCREMENT BY 1;

/* You may reference a created sequence by name using the 'DEFAULT'
 * keyword within a DDL table creation statement
 */
CREATE TABLE user_login (
	login_id INTEGER DEFAULT nextval('login_id_seq') PRIMARY KEY,
	login_name VARCHAR(200),
	login_pass VARCHAR(200)
);

/*
 * Stored Procedure : An entity, similar to a function, which performs
 * operations, but does not return data
 */
CREATE OR REPLACE PROCEDURE emp_percent_raise(
	percent_inc DEC, id INT
) LANGUAGE PLPGSQL
AS $$
BEGIN 
	UPDATE examples.EMPLOYEES 
	SET emp_salary = emp_salary * percent_inc
	WHERE emp_id = id;
COMMIT;
END $$

-- Invoke a stored procedure using the keyword 'Call'
CALL EMP_PERCENT_RAISE (1.1, 1000);

/*
 * View : An entity which effectively acts as a virtual table. It allows
 * you to apply an identifier to a query statement and refer to the named
 * view instead of the actual query. These are typically used to reference
 * commonly executed queries on a database for easier/faster retrieval. 
 * 
 * Syntax:
 * 
 * CREATE [OR REPLACE] VIEW <view_name> AS <query>
 */
CREATE OR REPLACE VIEW high_salaries AS
SELECT * FROM examples.employees
WHERE emp_salary > (SELECT AVG(emp_salary) FROM examples.employees);
/* Subqueries : A query performed within a Query, specifically used within
 * a WHERE clause to provide more specificity or optional checks when a 
 * single query does not provide enough data. Subqueries are commonly used 
 * to perform aggregate functions which compare data to individual records
 * retrieved from a query
 */


-- You may reference a view similar to referencing a traditional table
SELECT * FROM HIGH_SALARIES;