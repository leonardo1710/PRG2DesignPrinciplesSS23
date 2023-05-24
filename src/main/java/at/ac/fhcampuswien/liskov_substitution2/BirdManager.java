package at.ac.fhcampuswien.liskov_substitution2;

public class BirdManager {
    private String name;
    private String species;
    private String region;

    public BirdManager(String name, String species, String region) {
        this.name = name;
        this.species = species;
        this.region = region;
    }

    public void eat() {
        System.out.println(name + " is eating.");
    }

    public void fly() {
        System.out.println(name + " is flying.");
    }

    public void swim() {
        System.out.println(name + " is swimming.");
    }

    public void dive() {
        System.out.println(name + " is diving.");
    }
}
