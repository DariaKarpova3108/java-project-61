package hexlet.code;

import hexlet.code.games.CalculateGame;
import hexlet.code.games.Cli;
import hexlet.code.games.EvenGame;
import hexlet.code.games.GCD;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.\n1 - Greet\n" + "2 - Even\n" + "3 - Calc\n" +
                "4 - GCD\n"+ "0 - Exit\n" +
                "Your choice:");
        int number = scan.nextInt();
        scan.nextLine();
        if (number == 1) {
            Cli.greetings();
        } else if (number == 2) {
            EvenGame.playEvenGame();
        } else if (number==3) {
            CalculateGame.playCalculate();
        } else if (number == 4) {
            GCD.playGcd();
        }

    }
}
