package at.ac.fhcampuswien.liskov_substitution2;

public class Penguin {
    private BirdManager birdManager;

    public Penguin(String name, String species, String region) {
        this.birdManager = new BirdManager(name, species, region);
    }

    public void eat() {
        this.birdManager.eat();
    }

    public void smin(){
        this.birdManager.swim();
    }

    public void dive(){
        this.birdManager.dive();
    }
}
