package composite;

public class Naytonohjain implements Laiteosa{

    private final double hinta;

    public Naytonohjain(double hinta) {

        this.hinta = hinta;
    }
    @Override
    public Double hinta() {

        return hinta;
    }
}
