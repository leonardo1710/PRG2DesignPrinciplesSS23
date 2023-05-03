package at.ac.fhcampuswien.liskov_substitution;

public class Sparrow extends Bird implements ICanFly {
    public Sparrow(String name, String species, String region) {
        super(name, species, region);
    }

    @Override
    public void fly() {
        System.out.println("Sparrow is flying!");
    }

}
