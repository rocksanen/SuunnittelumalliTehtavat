package memento;

import java.util.Random;

public class Arvuuttaja {

    private int number;

    public Arvuuttaja() {
        Random random = new Random();
        number = random.nextInt(100);
    }

    public Memento liityPeliin() {
        return new Memento(number);
    }

    public boolean arvaus(Memento memento, int guess) {
        if (guess == memento.number()) {
            System.out.println("Arvauksesi oli oikein!");
            return true;
        } else {
            System.out.println("Arvauksesi oli väärin.");
            return false;
        }
    }
}
