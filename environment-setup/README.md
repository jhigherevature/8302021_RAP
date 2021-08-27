# RAP/Java Environment Setup Guide
---

## Purpose

> This document provides a list of the required technologies for anyone who will be participating in the RAP program. It details why each technology is required and provides some step-by-step instructions on how to install and configure the technologies. This guide also walks you through any needed environment setup.

**NOTE**: It is important that you install the correct versions of the tools listed here as not all versions of the technologies we will use are guaranteed to be compatible with each other. If you choose to use a different version of one of the tools listed here, you will be responsible for debugging issues that are specific to your version.

## Required Technologies

The following technologies are required in order to complete this phase of the program:

- **Git**: We'll be using Git as a version control tool during the course of this program. Not only will you use Git to track changes to your projects, but you'll also use it to collaborate with your trainer and with your fellow associates.
- **Java SE Development Kit 11**: We will be utilizing Java 11 as our primary language for the duration of the program. This software development kit will provide the compiler and runtime environment needed to quickly and efficiently develop Java applications.
- **Eclipse IDE**: We will be using Eclipse as our *integrated development environment* (IDE). Though you don't need an IDE to write code, an IDE provides several features that make rapid development (e.g. quickly writing and refactoring code) easier.
- **Apache Maven**: Maven is a software project management and build automation tool. We will use it to manage our projects' builds as it provides dependency management and streamlines several aspects of the testing life cycle.
- **PostgreSQL 10**: PostgreSQL is an open source relational database. We will leverage this technology in order to persist and organize data.
- **DBeaver**: DBeaver is a free, open source universal database tool that is compatible with several external data sources, PostgreSQL included. We'll use DBeaver in order to modify our databases and persist data using a simple user interface provided to us by the tool.
- **Apache Tomcat 8**: During this program, we will explore web development. As a result, we'll need a runtime environment for our web applications. Apache Tomcat provides a web server environment in which we can run our Java code so that we can easily and quickly deploy our web applications.
- **Postman**: Postman is used for testing RESTful APIs. We'll use it to set up collections of tests for the RESTful APIs we design throughout the program. It can also be used to quickly test a single endpoint.
- **Visual Studio Code (Optional)**: Visual Studio Code is a text editor that makes viewing and modifying code simple. Do not confuse this tool with an integrated development environment as it does not come equipped with all of the development tools you typically find in an IDE. This tool is optional, but it can be helpful if you are new to programming and wish to familiarize yourself with the syntax of the Java programming language. 

## Installation

You need only visit the official websites for each of the technologies listed and download the version of the tool that is compatible with your system.

Do note that setting system environment variables differs from machine to machine. This guide shows how to set environment variables on a Windows machine.

The first thing you'll want to do is open your web browser of choice. This guide will use *Chrome*.

**Note**: Many of the tools that you will install have different system installers that are platform dependent. It is **very** important that you download the correct installer. The following list details how you should choose the installer for a program:

- If you have a 32-bit version of Windows, use the installer that is marked as the 32-bit version.
- If you have a 64-bit version of Windows, use the installer that is marked as the 64-bit version.
- If you have a Linux distribution (e.g. Debian, Ubuntu, Red Hat, Fedora), you should choose the installer that matches your distribution.
- If you have a Mac, you should choose the installer that is marked as the Mac installer.

These options will be clearly labeled on the websites you visit to download the technologies. If you're not sure how to figure out what version of the Windows operating system you're running, do the following:

1. Type "Control Panel" into the Windows search bar and click on the "Control Panel" app.
2. Select "System and Security".
3. Select "System".

You should now see the following screen:

![Image of Windows System Settings](./images/windows-system.PNG)

You should see your operating system listed ("Windows 10" in the above example) and the system type listed under the "System" tab (a 64-bit operating system in the above example).

### WEEK 1: Install Visual Studio Code (Optional)
* [Visual Studio Code Install](./visual-studio-code-install.md)

### WEEK 1: Install Git
* [Git install (Windows)](./git-install-windows.md)
* [Git install (Mac)](./git-install-mac.md)

### WEEK 1: Install Java
* [Java install](./java-install.md)

### WEEK 1: Install Eclipse **Requires Java Install**
* [Eclipse install](./eclipse-install.md)

### WEEK 7: Install PostgreSQL 10
* [Windows PostgreSQL Install](./postgres-install.md)

### WEEK 7: Install DBeaver
* [DBeaver Install](./dbeaver-install.md)

### WEEK 7: Install Apache Maven
* [Windows Maven Install](./maven-install-windows.md)
* [Mac Maven Install](./maven-install-mac.md)

### WEEK 11: Install Apache Tomcat
* [Windows Install](./tomcat-install-windows.md)
* [Mac Install](./tomcat-install-mac.md)

### WEEK 11: Install Postman
* [Postman Install](./postman-install.md)

