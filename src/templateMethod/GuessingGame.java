package templateMethod;

import java.util.Random;
import java.util.Scanner;

public class GuessingGame extends Game {

    private int numberToGuess;
    private int currentPlayer;
    private int[] playerGuesses;
    private int numGuesses;

    // Pelin alustus, jossa arvotaan luku väliltä 1-10 ja aloitetaan pelaajien arvaukset.
    void initializeGame() {
        Random rand = new Random();
        numberToGuess = rand.nextInt(10) + 1;
        playerGuesses = new int[playersCount];
        currentPlayer = 0;
        numGuesses = 0;
        System.out.println("I'm thinking of a number between 1 and 10. Can you guess what it is?");
    }

    // Yhden pelaajan siirto, jossa kysytään pelaajan arvaus.
    void makePlay(int player) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Player " + (player + 1) + ", enter your guess: ");
        int guess = scanner.nextInt();
        playerGuesses[player] = guess;
        numGuesses++;
    }

    // Pelin lopetusehto, joka toteutuu, kun nykyisen pelaajan arvaus on oikea luku.
    boolean endOfGame() {
        return playerGuesses[currentPlayer] == numberToGuess;
    }

    // Pelin voittajan ilmoittaminen, kun arvaus on oikein.
    void printWinner() {
        System.out.println("Congratulations, Player " + (currentPlayer + 1) + "! You guessed the number " + numberToGuess + " in " + numGuesses + " tries.");
    }
}
