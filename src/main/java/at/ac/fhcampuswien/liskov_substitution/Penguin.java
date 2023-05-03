package at.ac.fhcampuswien.liskov_substitution;

public class Penguin extends Bird {
    public Penguin(String name, String species,String region) {
        super(name, species, region);
    }

    @Override
    public void fly() {
        throw new UnsupportedOperationException("Penguins can't fly!");
    }

    @Override
    public void swim() {
        System.out.println("Penguin is swimming like a pro!");
    }

    @Override
    public void dive() {
        System.out.println("Penguin is diving!");
    }
}
