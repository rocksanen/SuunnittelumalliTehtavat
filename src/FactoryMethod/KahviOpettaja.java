package FactoryMethod;

public class KahviOpettaja extends Opettaja{

    public Juoma createJuoma(){
        return new Kahvi();
    }
}
