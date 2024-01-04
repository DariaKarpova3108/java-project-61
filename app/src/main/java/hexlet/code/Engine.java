package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int GENERAL_RIGHT_COUNT_ANSWER = 3;

    public static void run(String description, String[][] taskAndAnswer) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!\n" + "May I have your name? ");
        String nameUser = scan.nextLine();
        System.out.println("Hello, " + nameUser + "!");
        System.out.println(description);
        for (int i = 0; i < GENERAL_RIGHT_COUNT_ANSWER; i++) {
            String rightAnswer = taskAndAnswer[i][1];
            System.out.println("Question: " + taskAndAnswer[i][0]);
            String answer = scan.next();
            System.out.println("Your answer: " + answer);
            if (!(answer.equals(rightAnswer))) {
                System.out.println("Your answer: " + answer + "\n"
                        + "'" + answer + "'" + " is wrong answer ;(. Correct answer was '" + rightAnswer + "'.\n"
                        + "Let's try again, " + nameUser + "!");
                return;
            }
            System.out.println("Correct!");
        }
        System.out.println("Congratulations, " + nameUser + "!");
    }
}
