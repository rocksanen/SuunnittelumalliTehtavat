package Composite;

public class Verkkokortti implements Laiteosa{

    private final double hinta;

    public Verkkokortti(double hinta) {

        this.hinta = hinta;
    }
    @Override
    public Double hinta() {

        return hinta;
    }
}
