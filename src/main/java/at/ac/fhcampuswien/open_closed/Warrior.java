package at.ac.fhcampuswien.open_closed;

public class Warrior extends Character implements BlockingAbility {
    public Warrior(String name, int health, int attackDamage) {
        super(name, health, attackDamage);
    }

    @Override
    public void setHealth(int health) {
        block(this);
        super.setHealth(health);
    }

    @Override
    public void attack(Character target) {
        System.out.println("Warrior attacks " + target.getName());
        target.setHealth(target.getHealth() - this.getAttackDamage());
    }

    @Override
    public void useSpecialAbility(Character character) {
        System.out.println("Warrior uses special ability to increase attack damage");
        setAttackDamage(getAttackDamage() + 10);
    }

    @Override
    public void block(Character character) {
        if (Math.random() < 0.1) {
            System.out.println("Warrior blocks attack");
        }
    }
}
