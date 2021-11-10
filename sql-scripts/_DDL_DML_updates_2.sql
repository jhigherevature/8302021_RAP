CREATE SEQUENCE examples.cust_id_seq START 1000 INCREMENT BY 1;
CREATE SEQUENCE examples.account_id_seq START 300000 INCREMENT BY 1;

CREATE TABLE examples.customers (
	cust_id INTEGER PRIMARY KEY DEFAULT NEXTVAL('examples.cust_id_seq'),
	login_id INTEGER REFERENCES examples.user_login(login_id),
	cust_name VARCHAR(200)
);

CREATE TABLE examples.accounts (
	account_id INTEGER PRIMARY KEY DEFAULT NEXTVAL('examples.account_id_seq'),
	primary_cust_id INTEGER REFERENCES examples.customers(cust_id) NOT NULL,
	secondary_cust_id INTEGER REFERENCES examples.customers(cust_id),
	account_value DECIMAL,
	account_type VARCHAR CHECK (account_type IN ('checking','saving'))
);

INSERT INTO examples.users VALUES (DEFAULT, 'James','123 main st, city USA 12345','555-666-6789');
INSERT INTO examples.users VALUES (DEFAULT, 'Brianna','456 main st, city USA 12345','555-777-7890');
INSERT INTO examples.users VALUES (DEFAULT, 'Margaret','789 main st, city USA 12345','555-888-8901');
INSERT INTO examples.users VALUES (DEFAULT, 'Tyler','321 main st, city USA 12345','555-999-9012');

INSERT INTO examples.user_login VALUES (DEFAULT, 'maggie_cust','maggie_cust_pass',1);

INSERT INTO user_login VALUES (DEFAULT, 'james_login','james_pass',6);
INSERT INTO user_login VALUES (DEFAULT, 'brianna_login','brianna_pass',7);
INSERT INTO user_login VALUES (DEFAULT, 'margaret_login','margaret_pass',8);
INSERT INTO user_login VALUES (DEFAULT, 'tyler_login','tyler_pass',9);

INSERT INTO examples.customers VALUES (DEFAULT, 10005, 'James');
INSERT INTO examples.customers VALUES (DEFAULT, 10006, 'Brianna');
INSERT INTO examples.customers VALUES (DEFAULT, 10007, 'Margaret');
INSERT INTO examples.customers VALUES (DEFAULT, 10008, 'Tyler');

INSERT INTO examples.customers VALUES (DEFAULT, 10009, 'Maggie');

INSERT INTO examples.accounts VALUES (DEFAULT, 1000, 1001, 0.00, 'saving');
INSERT INTO examples.accounts VALUES (DEFAULT, 1000, null, 100.00, 'checking');
INSERT INTO examples.accounts VALUES (DEFAULT, 1001, null, 200.00, 'checking');
INSERT INTO examples.accounts VALUES (DEFAULT, 1002, null, 500.00, 'checking');
INSERT INTO examples.accounts VALUES (DEFAULT, 1003, null, 450.00, 'saving');

SELECT * FROM examples.accounts WHERE PRIMARY_CUST_ID=1000 OR SECONDARY_CUST_ID=1000;