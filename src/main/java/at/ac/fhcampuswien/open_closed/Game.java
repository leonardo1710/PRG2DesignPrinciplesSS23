package at.ac.fhcampuswien.open_closed;

public class Game {
    public static void main(String[] args) {
        Character mage = new Mage("Gandalf", 100, 20);
        Character warrior = new Warrior("Aragorn", 100, 20);

        mage.attack(warrior);
        mage.specialMagicAttack(warrior);
        mage.specialPhysicalAttack(warrior);
        warrior.attack(mage);
        warrior.specialPhysicalAttack(mage);
        warrior.specialMagicAttack(mage);
    }
}

