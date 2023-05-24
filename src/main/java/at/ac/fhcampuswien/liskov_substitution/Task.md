# Liskov Substitution Principle
Liskov Substitution Principle (LSP) is a fundamental principle of object-oriented programming that states that objects of a superclass should be able to be replaced with objects of its subclasses without causing errors or unexpected behavior. 
In other words, any class that is a subtype of a parent class should be able to be used in place of that parent class without altering the correctness of the program.

The principle was introduced by Barbara Liskov in 1987 and is considered to be one of the five SOLID principles of object-oriented programming.

The LSP helps to ensure that code is extensible, maintainable, and scalable by promoting code reuse and reducing the likelihood of unexpected behavior in software systems. By adhering to the LSP, software developers can write more robust and flexible code that can accommodate changing requirements and new functionality over time.

<img alt="Liskov Substitution Principle" src="https://blog.codavel.com/hubfs/Imported_Blog_Media/LiskovSubtitutionPrinciple_Simon.jpg">
<div align="center">Source: <a href="https://blog.codavel.com/2018/09/25/liskov-substitution-principle">Codavel Blog (2023)</a></div>

## Description
Our application needs to handle different kinds of birds. Therefore, it was decided to create an abstract class ``Bird`` which provides the basic functionality for all birds. 
Some birds can fly, some can't. Some birds can swim, some can't. And so on.

```java
public abstract class Bird {
    private String name;
    private String species;
    private String region;

    public Bird(String name, String species, String region) {
        this.name = name;
        this.species = species;
        this.region = region;
    }

    public abstract void fly();

    public abstract void swim();

    public abstract void dive();
}
```
In the first draft of the program, each type of bird needs to override all methods of the ``Bird`` class, even if it does not need them, which violates the Liskov Substitution principle.
For example, a derived ``Penguin`` class could look like the following:

```java
public class Penguin extends Bird {
    public Penguin(String name, String species,String region) {
        super(name, species, region);
    }

    @Override
    public void fly() {
        throw new UnsupportedOperationException("Penguins can't fly!");
    }

    @Override
    public void swim() {
        System.out.println("Penguin is swimming like a pro!");
    }

    @Override
    public void dive() {
        System.out.println("Penguin is diving!");
    }
}
```

### Rules
To ensure the LSP is not violated, the following rules must be followed:

<b>Signature Rules:</b>
  * Overridden subtype method argument types can be identical or wider than the supertype method argument types
  * The return type of the overridden subtype method can be identical or narrower than the supertype method return types
  * The exceptions thrown by the overridden subtype method can be identical or narrower than the supertype method exceptions

<b>Behavior Rules:</b>
  * Preconditions cannot be strengthened in a subtype
  * Postconditions cannot be weakened in a subtype
  * Invariants of the supertype must be preserved in a subtype
  * History constraint of the supertype must be preserved in a subtype

You can find more information and code examples about the LSP [here](https://www.baeldung.com/java-liskov-substitution-principle) and [here](https://blog.codavel.com/2018/09/25/liskov-substitution-principle).

### Code Smells
How to identify if a subtype is not substitutable for its supertype?
  * The subtype throws exceptions for a behavior it cannot fulfill (e.g. ``Penguin`` throws an exception for the ``fly()`` method)
  * The subtype implements methods that do nothing or throw exceptions (e.g. ``Penguin`` implements the ``fly()`` method but does nothing)
  * The client knows the subtype and has to handle it differently (e.g. the client has to check if the bird is a ``Penguin`` and handle it differently)

## Tasks
Refactor the provided classes and/or create correct abstractions/compositions so that they fulfill the Liskov Substitution Principle.
It should be possible to handle all subtypes of ``Bird`` in the same way without causing errors or unexpected behavior.
Use inheritance, abstraction and/or composition to achieve this.

> Note: There are multiple ways to solve this task, having different advantages and disadvantages.



