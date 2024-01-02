package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static void run(String description, String[][] taskAndAnswer) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!\n" + "May I have your name? ");
        String nameUser = scan.nextLine();
        System.out.println("Hello, " + nameUser + "!");
        System.out.println(description);
        int count = 0;
        int generalCountOfRightAnswer = 3;
        do {
            String rightAnswer = taskAndAnswer[count][1];
            System.out.println("Question: " + taskAndAnswer[count][0]);
            String answer = scan.next();
            System.out.println("Your answer: " + answer);
            if (!(answer.equals(rightAnswer))) {
                System.out.println("Your answer: " + answer + "\n"
                        + "'" + answer + "'" + "is wrong answer ;(. Correct answer was '" + rightAnswer + "'.\n"
                        + "Let's try again, " + nameUser + "!");
                return;
            } else {
                System.out.println("Correct!");
                count++;
            }
        } while (count < generalCountOfRightAnswer);
        System.out.println("Congratulations, " + nameUser + "!");
    }
}
