# Dependency Inversion Principle

The Dependency Inversion Principle (DIP) is a software design principle that states that high-level modules or classes should not depend on low-level modules or classes. 
Instead, both high-level and low-level modules should depend on abstractions, such as interfaces or abstract classes.

Based on this idea, Robert C. Martin’s definition ("Agile Software Development: Principles, Patterns and Practices") of the Dependency Inversion Principle consists of two parts:
* High-level modules should not depend on low-level modules. Both should depend on abstractions.
* Abstractions should not depend on details. Details should depend on abstractions.

As a result the high-level and the low-level modules both depend on the same abstraction.

By depending on abstractions, high-level modules become more flexible and can be easily adapted to changes in low-level modules without requiring significant modifications. 
This also promotes modularity and testability, as modules can be developed and tested independently of each other.

It is often applied in combination with other principles, such as the Single Responsibility Principle (SRP) and the Open-Closed Principle (OCP), to create a robust and effective software architecture.

## Description
Suppose you have two classes: a high-level class called ``Client`` and a low-level class called ``Server``. 
The ``Server`` can send and receive data:
    
```java
public class Server {
    public void sendData(String data) {
        System.out.println("Data sent: " + data);
    }

    public void receiveData(String data) {
        System.out.println("Data received: " + data);
    }
}
```
The ``Client`` class might have a direct dependency on the Server class to send and receive data via the ``Server`` class:

```java
public class Client {
    private Server server;

    public Client(Server server) {
        this.server = server;
    }

    public void sendData(String data) {
        server.sendData(data);
    }

    public void receiveData(String data) {
        server.receiveData(data);
    }
}
```
The tight coupling between the ``Client`` and ``Server`` classes makes it difficult to change the implementation of the ``Server`` class without also changing the ``Client`` class.
For example if we want to have multiple types of servers, such as a ``TcpServer`` and a ``UdpServer``, we would have to modify the ``Client`` class to support the new types of servers.

## Tasks
Refactor your code, so it fulfills the Dependency Inversion Principle. 
Implement an abstraction layer on top of the ``Server`` class that both the ``Client`` and the ``Server`` depend on.
Add the 2 new classes ``TcpServer`` and ``UdpServer`` that implement the abstraction layer. Use your ``Client`` class to test your implementation.