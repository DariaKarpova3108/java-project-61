package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.\n1 - Greet\n" + "2 - Even\n" +
                "0 - Exit\n" +
                "Your choice:");
        int number = scan.nextInt();
        scan.nextLine();
        if (number == 1) {
            Cli.greetings();
        } else if (number == 2) {
            EvenGame.playEvenGame();
        }

    }
}
