package at.ac.fhcampuswien.open_closed;

public class Mage extends Character {
    public Mage(String name, int health, int attackDamage) {
        super(name, health, attackDamage);
    }

    @Override
    public void attack(Character target) {
        System.out.println("Mage attacks " + target.getName());
        target.setHealth(target.getHealth() - this.getAttackDamage());
    }

    @Override
    public void specialMagicAttack(Character target) {
        System.out.println("Mage uses special magic attack on " + target.getName());
        target.setHealth(target.getHealth() - this.getAttackDamage() * 2);
    }

    @Override
    public void specialPhysicalAttack(Character target) {
        System.out.println("Mage cannot use physical attacks!");
    }
}
