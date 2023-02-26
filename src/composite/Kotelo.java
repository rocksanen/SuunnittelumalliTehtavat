package composite;

import java.util.ArrayList;

public class Kotelo implements Laiteosa{

    private final ArrayList<Laiteosa> osat = new ArrayList<>();
    private final double hinta;

    public Kotelo(double hinta) {

        this.hinta = hinta;

    }

    public void lisaaOsa(Laiteosa osa) {

        osat.add(osa);
    }
    @Override
    public Double hinta() {
        return hinta + osat.stream().mapToDouble(Laiteosa::hinta).sum();
    }
}
