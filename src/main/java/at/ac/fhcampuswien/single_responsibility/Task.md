# Single Responsibility Principle

The Single Responsibility Principle (SRP) is a fundamental principle of software design that states that a class or module should have <b>only one reason to change</b>. In other words, a class or module should have a single responsibility or job, and that <b>responsibility should be encapsulated within</b> that class or module. 
This principle helps to ensure that software is modular, easier to understand, maintain, and extend. By separating concerns into individual classes or modules, it becomes easier to make changes without impacting other parts of the system. This principle is closely related to the concept of cohesion in software engineering.

<img src="https://thedavidmasters.files.wordpress.com/2018/10/single-responsibility-principle.jpg?w=1140">
<div align="center">Single Responsibility Principle. Source: <a href="https://thedavidmasters.com/2018/10/27/solid-design-principles/">Masters Development</a></div>

## Description
Suppose we have an application that needs to send emails to users.

The ``Email`` class is responsible for representing an email message and providing functionality for sending it. Its responsibilities include:

* Storing the sender and recipient email addresses.
* Storing the email's body.
* Providing a method to send the email.

Furthermore, emails should be formatted before they are sent to the recipient. Formatting is a separate concern that should be handled by a separate class. The ``EmailFormatter`` class is responsible for formatting emails.

## Tasks
* Identify the responsibilities of the ``Email`` class.
* Identify the responsibilities of the ``EmailFormatter`` class.
* Refactor the ``Email`` class so that it has only one responsibility.
* Refactor the ``EmailFormatter`` class so that it has only one responsibility.
