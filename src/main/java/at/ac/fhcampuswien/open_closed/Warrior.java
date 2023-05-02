package at.ac.fhcampuswien.open_closed;


public class Warrior extends Character {
    public Warrior(String name, int health, int attackDamage) {
        super(name, health, attackDamage);
    }

    @Override
    public void attack(Character target) {
        System.out.println("Warrior attacks " + target.getName());
        target.setHealth(target.getHealth() - this.getAttackDamage());
    }

    @Override
    public void specialMagicAttack(Character target) {
        System.out.println("Warrior cannot use magic!");
    }

    @Override
    public void specialPhysicalAttack(Character target) {
        System.out.println("Warrior uses special physical attack on " + target.getName());
        target.setHealth(target.getHealth() - this.getAttackDamage() * 2);
    }
}
