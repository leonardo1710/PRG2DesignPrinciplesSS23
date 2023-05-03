package at.ac.fhcampuswien.liskov_substitution;

public class App {
    public static void main(String[] args) {
        // Concrete subclasses of Bird
        Penguin penguin = new Penguin("Pingu", "Emperor Penguin",  "Antarctica");
        Sparrow sparrow = new Sparrow("Jack", "House Sparrow", "Europe");
        Duck duck = new Duck("Donald", "Mallard", "Europe");

        penguin.swim();
        sparrow.fly();
        duck.dive();

        // Swimming Birds:
        ICanSwim penguinSwim = new Penguin("Pingu", "Emperor Penguin",  "Antarctica");
        ICanSwim duckSwim = new Duck("Donald", "Mallard", "Europe");
        penguinSwim.swim();
        duckSwim.swim();

        // Flying Birds:
        ICanFly sparrowFly = new Sparrow("Jack", "House Sparrow", "Europe");
        ICanFly duckFly = new Duck("Donald", "Mallard", "Europe");
        sparrowFly.fly();
        duckFly.fly();
    }
}

