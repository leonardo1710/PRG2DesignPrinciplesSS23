package at.ac.fhcampuswien.open_closed;

public class Character {
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

    public void attack(Character target) {
        System.out.println("Character attacks " + target.getName());
        target.setHealth(target.getHealth() - this.getAttackDamage());
    }
}