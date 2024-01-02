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
        int number = scan.nextInt();
        scan.nextLine();
        switch (number) {
            case 1:
                Cli.greetings();
                break;
            case 2:
                EvenGame.playEvenGame();
                break;
            case 3:
                CalculateGame.playCalculate();
                break;
            case 4:
                GCD.playGcd();
                break;
            case 5:
                ProgressionGame.playProgression();
                break;
            case 6:
                Prime.playPrimeGame();
                break;
            case 0:
                break;
            default:
                System.out.println("Invalid game number. Please enter a number from 0 to 6.");
                break;

        }
    }
}
