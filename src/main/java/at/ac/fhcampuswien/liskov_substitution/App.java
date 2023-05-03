package at.ac.fhcampuswien.liskov_substitution;

public class App {
    public static void main(String[] args) {
        Bird penguin = new Penguin("Pingu", "Emperor Penguin", 3, "Antarctica");
        Bird sparrow = new Sparrow("Jack", "House Sparrow", 1, "Europe");
        Bird duck = new Duck("Donald", "Mallard", 2, "Europe");

        penguin.swim();
        sparrow.fly();
        duck.dive();
    }
}

