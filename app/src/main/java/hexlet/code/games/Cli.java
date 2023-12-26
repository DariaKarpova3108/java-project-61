package hexlet.code.games;

import java.util.Scanner;

public class Cli {
    public static String greetings() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!\n" +
                "May I have your name? ");
        String nameUser = scan.nextLine();
        System.out.println("Hello, " + nameUser + "!");
        return nameUser;
    }
}
