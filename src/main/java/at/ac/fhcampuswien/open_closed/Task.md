# Open-Closed Principle
The Open-Closed Principle (OCP) is a fundamental principle in software development that states that software entities (classes, modules, functions, etc.) should be <b>open for extension but closed for modification</b>. This means that the behavior of a software entity should be easily extendable without modifying its source code.

In other words, new functionality can be added to the system without changing the existing code. This can be achieved by <b>creating an abstraction layer that defines the behavior of the entity</b>, and then allowing new functionality to be added by <b>creating new implementations</b> of that abstraction.

The benefits of following the Open-Closed Principle include increased flexibility, maintainability, and reusability of code. It also allows for easier testing and reduces the risk of introducing bugs or unintended consequences when modifying existing code.

## Description
Suppose we have a Character class hierarchy that represents various types of characters in a video game:

```java
public abstract class Character {
    private String name;
    private int health;
    private int attackDamage;

    public Character(String name, int health, int attackDamage) {
        this.name = name;
        this.health = health;
        this.attackDamage = attackDamage;
    }

    public abstract void attack(Character target);
    
    // getters and setters
}

public class Warrior extends Character {
    public Warrior(String name, int health, int attackDamage) {
        super(name, health, attackDamage);
    }

    @Override
    public void attack(Character target) {
        // code to perform a warrior attack
    }
}

public class Mage extends Character {
    public Mage(String name, int health, int attackDamage) {
        super(name, health, attackDamage);
    }

    @Override
    public void attack(Character target) {
        // code to perform a mage attack
    }
}
```
We want to add support for new types of characters where each type can have special abilities - without modifying the existing code.
Eg.: Some characters should be able to do physical damage attacks, while others can do magical damage attacks. Some characters can have special abilities like healing or shielding. And so on..

In our ``Character`` class we can add those abilities like so:
```java
public abstract class Character {
    //fields
    //...other methods

    public abstract void specialMagicAttack(Character target);

    public abstract void specialPhysicalAttack(Character target);
}
```

<div style="background-color: #ffcccc; padding: 10px; border-radius: 5px;">
    <b>Warning:</b> But this is not a good solution because we are violating the Open-Closed Principle. We are modifying the existing code instead of extending it.
</div>

For example if we want to add a new type of character that can do a third type of damage, we would have to modify the `Character` class and add a new method for that type of character.
Also, characters which should not have any special abilities would still have those methods.

## Tasks

### 1. Create an abstraction 

To fix this violation, create a ``ChracterType`` interface that defines the special abilities of a character, eg.: 

```java
public interface CharacterType {
    void attack(Character attacker, Character target);
    void specialAbility(Character character);
}
```

### 2. Create a concrete implementation
Create concrete implementations for each character type that defines the special abilities of that type, eg.:

```java
public class WarriorType implements CharacterType {
    @Override
    public void attack(Character attacker, Character target) {
        // code to perform a warrior attack
    }

    @Override
    public void specialAbility(Character character) {
        // code to perform a warrior's special ability
    }
}
```

### 3. Refactor the `Character` class
Now, instead of defining the specific behavior for each type of character within the Character class, create instances of the appropriate CharacterType class and pass them to the ``Character`` constructor:
```java
public class Character {
    //...fields
    public Character(String name, int health, int attackDamage, CharacterType type) {
        this.name = name;
        this.health = health;
        this.attackDamage = attackDamage;
        this.type = type;
    }
}
```

Finally, adapt the ``Character`` class to use the provided implementations from ``CharacterType`` interface.