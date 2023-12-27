package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static void generalLogic() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!\n" +
                "May I have your name? ");
        String nameUser = scan.nextLine();
        System.out.println("Hello, " + nameUser + "!");
        int count = 0;
        do {
            System.out.print("Question: ");
            int rightAnswer = 0;
            int answer = scan.nextInt();
            System.out.println("Your answer: " + answer);
            if (!(answer == rightAnswer)) {
                System.out.println("Your answer: " + answer + "\n" +
                        "'" + answer + "'" + "is wrong answer ;(. Correct answer was '" + rightAnswer + "'.\n" +
                        "Let's try again, " + nameUser + "!");
                return;
            } else {
                System.out.println("Correct!");
                count++;
            }
        } while (count < 3);
        System.out.println("Congratulations, " + nameUser + "!");
    }
}
