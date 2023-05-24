package at.ac.fhcampuswien.liskov_substitution2;

public class Duck {
    private BirdManager birdManager;

    public Duck(String name, String species, String region) {
        this.birdManager = new BirdManager(name, species, region);
    }

    public void eat() {
        this.birdManager.eat();
    }

    public void fly() {
        this.birdManager.fly();
    }

    public void swim() {
        this.birdManager.swim();
    }

    public void dive() {
        this.birdManager.dive();
    }
}
