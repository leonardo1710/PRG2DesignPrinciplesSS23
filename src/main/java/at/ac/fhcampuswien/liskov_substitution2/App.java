package at.ac.fhcampuswien.liskov_substitution2;

public class App {
    public static void main(String[] args) {
        Penguin penguin = new Penguin("Pingu", "Emperor Penguin", "Antarctica");
        penguin.eat();
        penguin.smin();
        penguin.dive();

        Duck duck = new Duck("Donald", "Mallard", "Europe");
        duck.eat();
        duck.fly();
        duck.swim();
        duck.dive();

        Sparrow sparrow = new Sparrow("Jack", "House Sparrow", "Europe");
        sparrow.eat();
        sparrow.fly();
    }
}
