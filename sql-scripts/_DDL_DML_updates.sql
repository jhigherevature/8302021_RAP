-- Resetting table values since we are altering the table columns
TRUNCATE examples.users RESTART IDENTITY CASCADE;
TRUNCATE examples.user_login RESTART IDENTITY CASCADE;
TRUNCATE examples.employees RESTART IDENTITY CASCADE;

/*
 * The following script showcases DDL and DML code for the users,
 * user_login and employee tables.
 * 
 * Note, the ALTER statements for the employees and user_login tables are
 * provided since these tables were previously created, but also act as 
 * examples for ALTER statement syntax.
 */
-- DDL for users table
CREATE TABLE examples.users (
	user_id SERIAL PRIMARY KEY,
	user_name VARCHAR(200) NOT NULL,
	user_address VARCHAR(200) NOT NULL,
	user_phone VARCHAR(200)
);

-- DDL for user_login table
CREATE TABLE user_login (
	login_id INTEGER DEFAULT nextval('login_id_seq') PRIMARY KEY,
	login_name VARCHAR(200),
	login_pass VARCHAR(200)
);
ALTER TABLE examples.user_login ADD COLUMN user_id INTEGER REFERENCES examples.users(user_id);
ALTER SEQUENCE examples.login_id_seq RESTART WITH 10000;

-- DDL for employees table
CREATE TABLE examples.employees (
		emp_id INTEGER,
		emp_name VARCHAR(200),
		emp_title VARCHAR(100),
		emp_salary NUMERIC
);
ALTER TABLE examples.employees ADD COLUMN login_id INTEGER REFERENCES examples.user_login(login_id);
ALTER TABLE examples.employees ADD PRIMARY KEY (emp_id);
ALTER SEQUENCE examples.emp_id_seq RESTART WITH 2000;

-- DML for user_table
INSERT INTO examples.users VALUES (DEFAULT, 'Maggie','123 main st, city USA 12345','555-111-1234');
INSERT INTO examples.users VALUES (DEFAULT, 'Steve','456 main st, city USA 12345','555-222-2345');
INSERT INTO examples.users VALUES (DEFAULT, 'Quincy','789 main st, city USA 12345','555-333-3456');
INSERT INTO examples.users VALUES (DEFAULT, 'Leslie','321 main st, city USA 12345','555-444-4567');
INSERT INTO examples.users VALUES (DEFAULT, 'Bill','654 main st, city USA 12345','555-555-5678');

-- DML for user_login table
INSERT INTO user_login VALUES (DEFAULT, 'maggie_login','maggie_pass',1);
INSERT INTO user_login VALUES (DEFAULT, 'steve_login','steve_pass',2);
INSERT INTO user_login VALUES (DEFAULT, 'quincy_login','quincy_pass',3);
INSERT INTO user_login VALUES (DEFAULT, 'leslie_login','leslie_pass',4);
INSERT INTO user_login VALUES (DEFAULT, 'bill_login','bill_pass',5);

-- DML for employees table
INSERT INTO employees VALUES (NULL,'Maggie','CEO',210000.00, 10000);
INSERT INTO employees VALUES (NULL,'Steve','Manager',151000.00, 10001);
INSERT INTO employees VALUES (NULL,'Quincy','Developer',97000.00, 10002);
INSERT INTO employees VALUES (NULL,'Leslie','Tester',75000.00, 10003);
INSERT INTO employees VALUES (NULL,'Bill','Developer',111000.00, 10004);
