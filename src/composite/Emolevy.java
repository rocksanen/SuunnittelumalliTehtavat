package composite;

import java.util.ArrayList;

public class Emolevy implements Laiteosa{

    private final ArrayList<Laiteosa> osat = new ArrayList<>();
    private final double hinta;

    public Emolevy(double hinta) {

        this.hinta = hinta;
    }
    @Override
    public Double hinta() {

        return hinta + osat.stream().mapToDouble(Laiteosa::hinta).sum();
    }

    public void lisaaOsa(Laiteosa osa) {

        osat.add(osa);
    }

}
