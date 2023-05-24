package at.ac.fhcampuswien.open_closed;

import java.util.ArrayList;
import java.util.List;

public class Game {
    public static void main(String[] args) {
        Character mage = new Mage("Gandalf", 100, 20);
        Character warrior = new Warrior("Aragorn", 100, 30);

        List<Character> characters = new ArrayList<>();
        characters.add(mage);
        characters.add(warrior);

        int rounds = 2;

        for(int i = 0; i < rounds; i++) {
            // show stats:
            System.out.println(characters.get(0));
            System.out.println(characters.get(1));

            // do attacks:
            characters.get(0).attack(characters.get(1));
            characters.get(1).attack(characters.get(0));

            // use special abilities:
            characters.get(0).useSpecialAbility(characters.get(0));
            characters.get(1).useSpecialAbility(characters.get(1));
        }

        System.out.println("##### Game ended. ######");
        System.out.println("Stats: ");

        System.out.println(characters.get(0));
        System.out.println(characters.get(1));
    }
}
