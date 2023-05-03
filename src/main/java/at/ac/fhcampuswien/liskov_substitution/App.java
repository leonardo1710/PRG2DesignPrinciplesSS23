package at.ac.fhcampuswien.liskov_substitution;

public class App {
    public static void main(String[] args) {
        Bird penguin = new Penguin("Pingu", "Emperor Penguin",  "Antarctica");
        Bird sparrow = new Sparrow("Jack", "House Sparrow", "Europe");
        Bird duck = new Duck("Donald", "Mallard", "Europe");

        penguin.swim();
        sparrow.fly();
        duck.dive();
    }
}

