package at.ac.fhcampuswien.open_closed;

public abstract class Character {
    private String name;
    private int health;
    private int attackDamage;

    public Character(String name, int health, int attackDamage) {
        this.name = name;
        this.health = health;
        this.attackDamage = attackDamage;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getAttackDamage() {
        return attackDamage;
    }

    public void setAttackDamage(int attackDamage) {
        this.attackDamage = attackDamage;
    }

    public abstract void attack(Character target);

    public abstract void useSpecialAbility(Character character);

    @Override
    public String toString() {
        return "Character{" +
                "name='" + name + '\'' +
                ", health=" + health +
                ", attackDamage=" + attackDamage +
                '}';
    }
}
