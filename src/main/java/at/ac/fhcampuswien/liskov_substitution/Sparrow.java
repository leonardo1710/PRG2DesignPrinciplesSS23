package at.ac.fhcampuswien.liskov_substitution;

public class Sparrow extends Bird {
    public Sparrow(String name, String species, String region) {
        super(name, species, region);
    }

    @Override
    public void fly() {
        System.out.println("Sparrow is flying!");
    }

    @Override
    public void swim() {
        throw new UnsupportedOperationException("Sparrows can't swim!");
    }

    @Override
    public void dive() {
        throw new UnsupportedOperationException("Sparrows can't dive!");
    }

}
