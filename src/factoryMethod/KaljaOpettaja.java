package factoryMethod;

public class KaljaOpettaja extends Opettaja{

    public Juoma createJuoma() {return new Kalja();}

}
