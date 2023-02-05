package Composite;

public class Prosessori implements Laiteosa{

    private final double hinta;

    public Prosessori(double hinta) {

        this.hinta = hinta;
    }
    @Override
    public Double hinta() {

        return hinta;
    }
}
