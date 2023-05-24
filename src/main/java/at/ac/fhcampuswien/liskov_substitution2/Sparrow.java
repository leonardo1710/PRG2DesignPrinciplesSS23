package at.ac.fhcampuswien.liskov_substitution2;

public class Sparrow {
    private BirdManager birdManager;

    public Sparrow(String name, String species, String region) {
        this.birdManager = new BirdManager(name, species, region);
    }

    public void eat() {
        this.birdManager.eat();
    }

    public void fly() {
        this.birdManager.fly();
    }
}
