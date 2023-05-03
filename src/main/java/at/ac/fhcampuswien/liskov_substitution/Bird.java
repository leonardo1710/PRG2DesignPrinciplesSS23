package at.ac.fhcampuswien.liskov_substitution;

public abstract class Bird {
    private String name;
    private String species;
    private String region;

    public Bird(String name, String species, String region) {
        this.name = name;
        this.species = species;
        this.region = region;
    }

    public abstract void fly();

    public abstract void swim();

    public abstract void dive();
}
