# Banking App - Project Overview

## Overview

   The Bank app is a console-based application that simulates banking operations. A customer can apply for an account, view their balance, and make withdrawals and deposits. An employee can approve or deny accounts and view account balances for their customers. The banking application is due at the start of Week 12, as you will be required to present your project to the class as part of the final project requirements.

As you continue to work on your project, you will be responsible for various milestones. These Milestones are due at the start of Weeks 8, 9, 10 and 11.


### Milestone 1 - Due Week 8 - 10/18
* Create an Entity Relationship Diagram to model the structure of your Project Database
  * Your Project should include at least 3 tables. Ex:
    * Accounts Table
    * User Table
    * Login Table

### Milestone 2 - Due Week 9 - 10/25
* Create an sql file with DDL code that specifies the tables, columns, and constraints of your database.
* Additionally, create at least 2 records per table to use for testing purposes, and provide the DML code for these records.
* Using the Scanner class, create classes that support printing messages to your user and a class which can parse user input from a Scanner to perform different actions.
  * Support the ability to "login" using dummy data (this does NOT require that your login input actually send a request to your DB).
  * After "logging in" a menu should provide functionality that is relevant to the type of user logged in.
  * Print appropriate messages for each type of action attempted.
    * i.e. selecting "deposit" asks the user to enter a deposit amount.

### Milestone 3 - Due Week 10 - 11/1
* Create Model Classes which represent how data is stored in your database.
  * Model classes in Java should follow a Java Bean Design Pattern
* Correctly configure a POM.xml file for your project.
* Create an SQL Connection or Database Utility class which establishes a connection to your database
  * This class should use login credentials for a user that you create using DDL and DCL to allow for access to part or all of your database tables and schemas
* Create a tester class which prints a message on establishing a successful connection to the database
  * Provide a screenshot showcasing that you have successfully connected to your database
* Create a Data Access Object Interface and Implementation class which contains an add, remove, delete and update method for at least one of your database tables
  * The DAO code should leverage an associated model class created in the previous milestone.

### Milestone 4 - Due Week 11 - 11/8
* Add Log4J2 configurations to your Maven POM file
* Add JUnit configurations to your Maven POM file
* Configure a log4j2.properties file to write logs for your project
  * Create a logger that can write to a file
* Create at least three (3) JUnit tests
