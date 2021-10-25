# Banking App

## Description

   The Bank app is a console-based application that simulates banking operations. A customer can apply for an account, view their balance, and make withdrawals and deposits. An employee can approve or deny accounts and view account balances for their customers. Note, you are free to use a different project theme and include different functionality, however, your project must still use the same technologies covered during training, as well as fulfil certain requirements. If you would like to use a different theme you must let your instructor know as soon as possible.

## Purpose

   We want to see that you can meet deadlines and that you can code. You are expected to complete the following requirements and give a 5-10 minute presentation of your project to our QC team.

## Functionality Overview
* A user can login.
* A user can register for a customer account/apply for a new bank account with a starting balance.
	* When the customer applies for an account, then ensure that a bank employee must login to approve this pending account.
	* NOTE: Project with an alternative theme must have some ability to create a new database record associated with another table
* A customer can view the balance of a specific account.
	* Alternative project themes must have some ability to view/retrieve records stored on the database.
* As a customer can make a withdrawal or deposit to a specific account.
	* Alternative project themes must have some ability to alter records on the database.
* The system rejects invalid transactions.
	* Ex:
		* A withdrawal that would result in a negative balance.
		* A deposit or withdrawal of negative money.
	* Alternative project themes must have criteria to reject an invalid or incomplete record.
* An employee can approve or reject an account.
	* Alternative project themes must have some additional functionality for a "higher level" user to supervisor or manage other "lower level" users
* An employee can view a customer's bank accounts.
	* Alternative project themes must have some ability to view user generated records.
* A customer can post a money transfer to another account registered to them.
* A customer can accept a money transfer from another account.
* A log of all transactions is available.
* JUnit tests are written which test functionality of class methods.

## Grading Criteria
	Your project will be evaluated using the following categories:
1. Functionality should reflect the below user stories.
2. Data is stored in a database.
3. Data Access is performed through the use of JDBC in a data layer consisting of Data Access Objects.
4. All input is received using the java.util.Scanner class.
5. Log4j is implemented to log events to a file.
6. There are a minimum of 10 JUnit tests.

## User Stories
	While working through this project. Make sure to use the following User stories as a guide when implementing functionality:

* As a user, I can login.
* As a customer, I can apply for a new bank account with a starting balance.
* As a customer, I can view the balance of a specific account.
* As a customer, I can make a withdrawal or deposit to a specific account.
* As the system, I reject invalid transactions.
	* Ex:
		* A withdrawal that would result in a negative balance.
		* A deposit or withdrawal of negative money.
* As an employee, I can approve or reject an account.
* As an employee, I can view a customer's bank accounts.
* As a user, I can register for a customer account.
* As a customer, I can post a money transfer between my own accounts.
* As an employee, I can view a log of all transactions [optional: This log can be parsed and viewed within the application].

* [optional] As a customer, I can post a money transfer to another customer's account
* [optional] As a customer, I can accept a money transfer, from another customer, into my account.

### Project Evaluation Parameters
Your project will be evaluted using the following criteria:
1) Your project will be evaluated based on coverage of technology rather than the strict adherence to theme or a checklist of completion.
2) How well you present, naming conventions, separation of code into various classes, how well have you applied OOP and design patterns.
3) A focus will be placed on what you have learned during training and less on specific application of things/technologies.