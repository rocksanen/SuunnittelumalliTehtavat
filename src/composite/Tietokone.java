package composite;

import java.util.ArrayList;

public class Tietokone implements Laiteosa{

    private final ArrayList<Laiteosa> osat = new ArrayList<>();

    public void lisaaOsa(Laiteosa osa) {

        osat.add(osa);

    }
    @Override
    public Double hinta() {
        return osat.stream().mapToDouble(Laiteosa::hinta).sum();
    }

    @Override
    public String toString() {

        return "Tietokoneen hinta: " + hinta() + " euroa";

    }
}
