package prototype;

import java.util.Date;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {


        Date currentTime = new Date();
        Clock clock1 = new Clock(currentTime);
        Clock clock2 = (Clock) clock1.clone();

        System.out.println("Original Clock: " + clock1.getTime());
        System.out.println("Cloned Clock: " + clock2.getTime());

        // Syväkopioinnin testaus
        currentTime.setTime(1234567890);
        System.out.println("\nAfter changing original clock time:");
        System.out.println("Original Clock: " + clock1.getTime());
        System.out.println("Cloned Clock: " + clock2.getTime());

        // Matalakopioinnin testaus
        Clock clock3 = clock1;
        currentTime.setTime(987654321);
        System.out.println("\nAfter changing original clock time again:");
        System.out.println("Original Clock: " + clock1.getTime());
        System.out.println("Cloned Clock: " + clock2.getTime());
        System.out.println("Assigned Clock: " + clock3.getTime());
    }
}
