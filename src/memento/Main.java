package memento;

public class Main {

    public static void main(String[] args) {



        Arvuuttaja arvuuttaja = new Arvuuttaja();

        Asiakas asiakas1 = new Asiakas(arvuuttaja);
        Asiakas asiakas2 = new Asiakas(arvuuttaja);
        Asiakas asiakas3 = new Asiakas(arvuuttaja);

        Thread thread1 = new Thread(asiakas1);
        Thread thread2 = new Thread(asiakas2);
        Thread thread3 = new Thread(asiakas3);

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
