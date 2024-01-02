package hexlet.code;

import hexlet.code.games.*;

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
            case 2:
                EvenGame.playEvenGame();
            case 3:
                CalculateGame.playCalculate();
            case 4:
                GCD.playGcd();
            case 5:
                ProgressionGame.playProgression();
            case 6:
                Prime.playPrimeGame();
        }
    }
}
