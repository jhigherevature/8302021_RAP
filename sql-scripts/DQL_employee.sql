/*
 * the SELECT statement allows you to retrieve data from your DB.
 * When using SELECT you can specify the exact columns (and apply
 * functionality throughout the entire search).
 * 
 * the Select operation is non-transactional (we do not effect the data in our
 * table even if we apply some other functionality such as a search for averages.
 * 
 * the select operation will return a 'resultset'
 * 
 * SYNTAX:
 * SELECT <column_name>... FROM <table_name> [WHERE...] [GROUP BY] [HAVING] [ORDER BY]
 */ 
-- The '*' is a wildcard and specifies all columns in a select statement
SELECT * FROM examples.EMPLOYEES;

-- WHERE : allow for a filter on which values to return in our Resultset
SELECT emp_name, emp_title FROM EXAMPLES.EMPLOYEES;
SELECT emp_name, emp_title FROM EXAMPLES.EMPLOYEES WHERE EMP_TITLE='Developer';

-- GROUP BY : allows FOR the RESULT SET TO GROUP the VALUES based ON a COLUMN that IS specified
SELECT emp_title FROM EXAMPLES.EMPLOYEES GROUP BY EMP_TITLE;

-- HAVING : a secondary aggregation/filter of data based on the grouping of information that is specifed earlier in the query
SELECT emp_title, sum(emp_salary) FROM EXAMPLES.EMPLOYEES
GROUP BY EMP_TITLE;
SELECT emp_title, sum(emp_salary) FROM EXAMPLES.EMPLOYEES
GROUP BY EMP_TITLE HAVING sum(EMP_SALARY) > 600000;

-- ORDER BY : allows you TO specify how the DATA IS displayed WITHIN the resultset
SELECT * FROM EXAMPLES.EMPLOYEES;
SELECT * FROM EXAMPLES.EMPLOYEES ORDER BY EMP_SALARY DESC;

/* ALL TOGETHER: */
SELECT AVG(emp_salary), emp_title FROM EXAMPLES.EMPLOYEES
WHERE EMP_SALARY < 130000 GROUP BY EMP_TITLE
HAVING avg(EMP_SALARY) > 100000 ORDER BY EMP_TITLE ASC;

/*
 * LIKE : allows you to filter WHERE clauses using string values based on
 * character matching sequences. LIKE offers two wild-card indicators:
 * 
 * '%' - Wildcard for any # of characters AND any value for those characters
 * 
 * '_' - Wildcard for any value of character BUT specifically a SINGLE character value
 * 
 * Casing for the letters supplied in the sequence you wish to match matters
 * Note that wildcards match either casing.
 * 
 * When performing a LIKE operation, it is traditional to use a Scalar function
 * to convert the resultset values to a particular casing 
 */
SELECT * FROM EMPLOYEES WHERE EMP_NAME LIKE 'J%e%'; -- Jessica & Joseph
SELECT * FROM EMPLOYEES WHERE EMP_NAME LIKE '%s%';

SELECT * FROM EMPLOYEES WHERE LOWER(EMP_NAME) LIKE 'j%e%';
SELECT * FROM EMPLOYEES WHERE UPPER(EMP_NAME) LIKE '%S%';

/*
 * BETWEEN & AND : When using the 'BETWEEN' keyword, we also use the 'AND'
 * keyword to specify the upper and lower bounds of the search range
 */ 
SELECT * FROM examples.employees WHERE EMP_SALARY BETWEEN 90000 AND 130000;

/*
 * IN - Allows you to perform a search filter based on a set of values that
 * you specify in a list. The resultset returned must match a value within the
 * IN clause based on the column you are trying to match.
 */
SELECT * FROM EXAMPLES.EMPLOYEES WHERE LOWER(emp_title) IN ('tester','developer');