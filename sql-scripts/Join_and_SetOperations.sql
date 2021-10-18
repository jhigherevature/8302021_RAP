/*
 * Aliases : A way to add an identifier/monkier to a table or column
 * 		within a query, so as to quickly reference a table name or 
 * 		return a column in a result set with a different name for ease
 * 		of understanding. Aliases are declared in queries using the
 * 		keyword 'AS'. However, the 'AS' keyword can be omitted when
 * 		describing the table
 */ 

-- INNER JOIN : Join data across tables which match the column values
/*
 * Typically when joining records from multiple tables, the PK & associated
 * FK columns are referenced in an Equi-join condition. However, there is
 * nothing wrong with associating data from any column across both tables
 * so long as the datatype is similar
 */
SELECT p.player_name, t.team_name FROM examples.players AS p
INNER JOIN examples.team AS t ON p.team_id = t.team_id;

SELECT p.player_name, t.team_name FROM examples.players AS p
INNER JOIN examples.team AS t ON p.PLAYER_ID = t.team_id;

-- FULL OUTER JOIN 
SELECT * FROM examples.players p FULL OUTER JOIN
examples.team t ON p.PLAYER_ID = t.TEAM_ID;

-- LEFT JOINS : The result set is based on the first table's values
SELECT p.player_salary, t.team_name FROM examples.players p
LEFT JOIN examples.team t ON p.player_id = t.team_id;

SELECT p.player_salary, t.team_name FROM examples.players p
LEFT JOIN examples.team t ON p.team_id = t.team_id;

-- RIGHT JOINS : The result set is based on the second table's values
SELECT p.player_salary, t.team_name FROM examples.players p
RIGHT JOIN examples.team t ON p.player_id = t.team_id;

SELECT p.player_salary, t.team_name FROM examples.players p
RIGHT JOIN examples.team t ON p.team_id = t.team_id;


-- SELF JOIN : The Result set is based on records on the same table
SELECT a.emp_name AS emp1, b.emp_name AS emp2 FROM examples.employees a
INNER JOIN examples.employees b ON a.emp_id = b.supervisor_id;

/*
 * Where statements alone are not sufficient to perform the same query
 * as above
 * 
 * SELECT a.emp_name FROM examples.EMPLOYEES a WHERE a.emp_id = 1000;
 */


/*
 * SET Operations : Perform a query against mutliple result sets and
 * 		compare data from those sets to determine a final result set
 * 		that is provided
 */
-- UNIONS : All records from both result sets displayed together
SELECT p.player_id AS id, p.player_name AS name FROM examples.players p
UNION SELECT t.team_id, t.team_name FROM examples.team t;

-- INTERSECT : Return data from 2 results sets that match values
SELECT p.player_id AS id FROM examples.players p
INTERSECT SELECT t.team_id FROM examples.team t;

-- EXCEPT : Return data from 2 result sets that do NOT match values
SELECT p.player_id AS id FROM examples.players p
EXCEPT SELECT t.team_id FROM examples.team t;

/*
 * Subqueries : Performing multiple queries within the same query
 * 		operation. Specifically subqueries are performed with WHERE
 * 		clauses to specify some additional information that is searched
 * 		first.
 */
SELECT avg(player_salary) FROM examples.PLAYERS;
SELECT player_name FROM examples.PLAYERS WHERE PLAYER_SALARY > 590500;
SELECT player_name FROM examples.PLAYERS WHERE PLAYER_SALARY < 590500;

SELECT player_name FROM examples.PLAYERS WHERE PLAYER_SALARY > 
(SELECT avg(player_salary) FROM examples.PLAYERS);
SELECT player_name FROM examples.PLAYERS WHERE PLAYER_SALARY < 
(SELECT avg(player_salary) FROM examples.PLAYERS);