package abstractFactory;

public class AdidasTehdas implements VaateTehdas{
    @Override
    public Farmarit luoFarmarit() {
        return new Farmarit();
    }

    @Override
    public Kengat luoKengat() {
        return new Kengat();
    }

    @Override
    public Lippis luoLippis() {
        return new Lippis();
    }

    @Override
    public Tpaita luoTpaita() {
        return new Tpaita();
    }

    public String getMerkki() {

        return "Adidas";
    }
}
