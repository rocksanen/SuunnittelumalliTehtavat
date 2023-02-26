package composite;

public class Muistipiiri implements Laiteosa{

    private final double hinta;

    public Muistipiiri(double hinta) {

        this.hinta = hinta;

    }
    @Override
    public Double hinta() {

        return hinta;
    }
}
