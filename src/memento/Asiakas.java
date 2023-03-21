package memento;

public class Asiakas implements Runnable {

    private final Arvuuttaja arvuuttaja;

    public Asiakas(Arvuuttaja arvuuttaja) {
        this.arvuuttaja = arvuuttaja;
    }

    @Override
    public void run() {
        Memento memento = arvuuttaja.liityPeliin();
        while(!arvuuttaja.arvaus(memento, arvaaLuku())) {
            System.out.println("arvaa uudestaan");
        }
    }

    private int arvaaLuku() {
        return (int) (Math.random() * 100);
    }
}
