/*
 * TCL - Transaction Control Language allows you to bundle multiple
 * transactional statements and even create savepoints within the same
 * transaction in case a mistake is made, or you want to simply revert
 * to a previous state of your DB...
 * 
 * BEGIN - marks the start of a transaction
 * COMMIT - marks the end of a transaction
 * 
 * SAVEPOINT - creation of an entity which tracks the state of our DB at
 * 	some given point in time
 * 		Syntax:
 * 			SAVEPOINT <savepoint_name>
 * 
 * ROLLBACk - revert changes made to our DB to a previous savepoint created
 * 		Syntax:
 * 			ROLLBACK TO SAVEPOINT <savepoint_name>
 * 
 * **NOTE: Savepoint and Rollback can only be used on a transaction-by-transaction
 * basis 
 */
BEGIN;
	INSERT INTO examples.employees VALUES(1010, 'RevWorker_1','Developer',150000);
	SAVEPOINT my_save_1;
	INSERT INTO examples.employees VALUES(1011, 'RevWorker_2','Manager',150000);
	INSERT INTO examples.employees VALUES(1012, 'RevWorker_3','Tester',150000);
SELECT * FROM examples.employees;
	ROLLBACK TO SAVEPOINT my_save_1;
SELECT * FROM examples.employees;
COMMIT;

