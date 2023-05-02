package at.ac.fhcampuswien.open_closed;

public class Game {
    public static void main(String[] args) {
        Character mage = new Mage("Gandalf", 100, 20);
        Character warrior = new Warrior("Aragorn", 100, 30);

        mage.attack(warrior);
        warrior.attack(mage);

        mage.useSpecialAbility(mage);
        warrior.useSpecialAbility(warrior);

        System.out.println(mage);
        System.out.println(warrior);
    }
}
