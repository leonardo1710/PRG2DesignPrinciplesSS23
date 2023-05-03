# Open-Closed Principle
The Open-Closed Principle (OCP) is a fundamental principle in software development that states that software entities (classes, modules, functions, etc.) should be <b>open for extension but closed for modification</b>. This means that the behavior of a software entity should be easily extendable without modifying its source code.

In other words, new functionality can be added to the system without changing the existing code. This can be achieved by <b>creating an abstraction layer that defines the behavior of the entity</b>, and then allowing new functionality to be added by <b>creating new implementations</b> of that abstraction.

The benefits of following the Open-Closed Principle include increased flexibility, maintainability, and reusability of code. It also allows for easier testing and reduces the risk of introducing bugs or unintended consequences when modifying existing code.

## Description
Let's say we have a game that has different types of characters, such as warriors, mages, and archers. Each type of character has a unique attack style, and we want to be able to add new types of characters without modifying the existing code.
Furthermore, each concrete type of character has a special ability. For example, a warrior can use a shield to block incoming attacks, while a mage can cast spells to heal itself.
A common class that represents all characters is the `Character` class:

```java
public class Character {
    private String name;
    private int health;
    private int attackDamage;

    public Character(String name, int health, int attackDamage) {
        this.name = name;
        this.health = health;
        this.attackDamage = attackDamage;
    }

    public void attack(Character target){
        target.setHealth(target.getHealth() - this.getAttackDamage());
    }
    
    // getters and setters
}
```
In our ``Character`` class we could add those attacks and abilities like so:
```java
public abstract class Character {
    //fields
    //...other methods

    public abstract void specialMagicHeal(Character target);

    public abstract void specialWarriorBlock(Character character);
}
```

<div style="background-color: #ffcccc; padding: 10px; border-radius: 5px;">
    <b>Warning:</b> But this is not a good solution because we are violating the Open-Closed Principle. We are modifying the existing code instead of extending it.
</div>

## Tasks
Make use of abstraction to make your code open for extension but closed for modification.

To test if your solution does not violate the open-closed principle, try to add a new type of character. If you do not have to modify the existing code, you have successfully implemented the open-closed principle.