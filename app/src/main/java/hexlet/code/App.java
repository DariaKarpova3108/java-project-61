package hexlet.code;

import hexlet.code.games.*;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.\n1 - Greet\n" + "2 - Even\n" + "3 - Calc\n" +
                "4 - GCD\n" + "5 - Progression\n" + "0 - Exit\n" +
                "Your choice:");
        int number = scan.nextInt();
        scan.nextLine();
        if (number == 1) {
            Cli.greetings();
        } else if (number == 2) {
            EvenGame.playEvenGame();
        } else if (number == 3) {
            CalculateGame.playCalculate();
        } else if (number == 4) {
            GCD.playGcd();
        } else if (number == 5) {
            ProgressionGame.playProgression();
        }
    }
}
