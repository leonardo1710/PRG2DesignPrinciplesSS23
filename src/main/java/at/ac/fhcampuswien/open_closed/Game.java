package at.ac.fhcampuswien.open_closed;

public class Game {
    public static void main(String[] args) {
        Character mage = new Character("Gandalf", 100, 20);
        Character warrior = new Character("Aragorn", 100, 20);

        mage.attack(warrior);
        warrior.attack(mage);
    }
}

