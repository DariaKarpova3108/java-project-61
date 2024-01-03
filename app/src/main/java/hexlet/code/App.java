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
        final int GREETINGS_GAME = 1;
        final int EVEN_GAME = 2;
        final int CALCULATE_GAME = 3;
        final int GCD_GAME = 4;
        final int PROGRESSION_GAME = 5;
        final int PRIME_GAME = 6;
        final int EXIT_GAME = 0;

        int number = scan.nextInt();
        scan.nextLine();
        switch (number) {
            case GREETINGS_GAME:
                Cli.greetings();
                break;
            case EVEN_GAME:
                EvenGame.playEvenGame();
                break;
            case CALCULATE_GAME:
                CalculateGame.playCalculate();
                break;
            case GCD_GAME:
                GCD.playGcd();
                break;
            case PROGRESSION_GAME:
                ProgressionGame.playProgression();
                break;
            case PRIME_GAME:
                Prime.playPrimeGame();
                break;
            case EXIT_GAME:
                break;
            default:
                System.out.println("Invalid game number. Please enter a number from 0 to 6.");
                break;
        }
    }
}
