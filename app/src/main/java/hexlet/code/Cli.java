package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static String greetings() {
        Scanner scan = new Scanner(System.in);
        System.out.print("May I have your name? ");
        String userName = scan.nextLine();
        return "Hello, " + userName + "!";
    }
}
