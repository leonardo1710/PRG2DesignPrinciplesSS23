package at.ac.fhcampuswien.liskov_substitution;

public class Duck extends Bird {
    public Duck(String name, String species, String region) {
        super(name, species, region);
    }

    @Override
    public void fly() {
        System.out.println("Duck is flying!");
    }

    @Override
    public void swim() {
        System.out.println("Duck is swimming!");
    }

    @Override
    public void dive() {
        System.out.println("Duck is diving!");
    }
}
