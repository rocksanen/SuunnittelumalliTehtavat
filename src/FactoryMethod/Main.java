package FactoryMethod;

public class Main {

    public static void main(String[] args) {
        AterioivaOtus opettaja = new Opettaja();
        AterioivaOtus opettaja2 = new KahviOpettaja();
        AterioivaOtus opettaja3 = new KaljaOpettaja();
        opettaja.aterioi();
        opettaja2.aterioi();
        opettaja3.aterioi();
    }
}
