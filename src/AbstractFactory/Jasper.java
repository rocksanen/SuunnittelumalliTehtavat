package AbstractFactory;

public class Jasper {

    private final Farmarit farmarit;
    private final Kengat kengat;
    private final Lippis lippis;
    private final Tpaita tpaita;

    private final String merkki;


    public Jasper(VaateTehdas vaateTehdas) {

        farmarit = vaateTehdas.luoFarmarit();
        kengat = vaateTehdas.luoKengat();
        lippis = vaateTehdas.luoLippis();
        tpaita = vaateTehdas.luoTpaita();
        merkki = vaateTehdas.getMerkki();

    }

    public String toString() {
        return "Jasper käyttää " + merkki + " tuotteita, jotka ovat: " + "\n" +
                farmarit.toString() + " \n" +
                kengat.toString() + "\n" +
                lippis.toString() + "\n" +
                tpaita.toString() + "\n";
    }
}
