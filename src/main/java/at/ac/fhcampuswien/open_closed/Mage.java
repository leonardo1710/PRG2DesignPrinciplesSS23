package at.ac.fhcampuswien.open_closed;

public class Mage extends Character implements HealingAbility {

    public Mage(String name, int health, int attackDamage) {
        super(name, health, attackDamage);
    }

    @Override
    public void attack(Character target) {
        System.out.println("Mage attacks " + target.getName());
        target.setHealth(target.getHealth() - this.getAttackDamage());
    }

    @Override
    public void useSpecialAbility(Character character) {
        heal(character);
    }

    @Override
    public void heal(Character character) {
        System.out.println(character.getName() + " heals itself.");
        character.setHealth(character.getHealth() + 10);
    }
}
