package hexlet.code;

import hexlet.code.games.CalculateGame;
import hexlet.code.games.EvenGame;
import hexlet.code.games.GCD;
import hexlet.code.games.Prime;
import hexlet.code.games.ProgressionGame;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("""
                Please enter the game number and press Enter.
                1 - Greet
                2 - Even
                3 - Calc
                4 - GCD
                5 - Progression
                6 - Prime
                0 - Exit
                Your choice:""");
        final int greetingGame = 1;
        final int evenGame = 2;
        final int calculateGame = 3;
        final int gcdGame = 4;
        final int progressionGame = 5;
        final int primeGame = 6;
        final int exitGame = 0;

        int number = scan.nextInt();
        scan.nextLine();
        switch (number) {
            case greetingGame:
                Cli.greetings();
                break;
            case evenGame:
                EvenGame.playEvenGame();
                break;
            case calculateGame:
                CalculateGame.playCalculate();
                break;
            case gcdGame:
                GCD.playGcd();
                break;
            case progressionGame:
                ProgressionGame.playProgression();
                break;
            case primeGame:
                Prime.playPrimeGame();
                break;
            case exitGame:
                break;
            default:
                System.out.println("Invalid game number. Please enter a number from 0 to 6.");
                break;
        }
    }
}
