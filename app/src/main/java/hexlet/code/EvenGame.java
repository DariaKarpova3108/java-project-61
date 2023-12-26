package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class EvenGame {
    public static void playEvenGame() {
        System.out.print("Welcome to the Brain Games!\n" +
                "May I have your name?");
        Scanner scan = new Scanner(System.in);
        String nameUser = scan.nextLine();
        int rightAnswers = 0;
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        do {
            Random rand = new Random();
            int numberOfFirstTask = rand.nextInt(100) + 1;
            System.out.println("Question: " + numberOfFirstTask);
            String answerOfFirstTask = scan.nextLine();
            System.out.println("Your answer: " + answerOfFirstTask);
            if (!answerOfFirstTask.equals(EvenGame.isEven(numberOfFirstTask))) {
                System.out.println("'yes' is wrong answer ;(. Correct answer was 'no'.\n" +
                        "Let's try again, " + nameUser + "!");
                return;
            }
            System.out.println("Correct!");
            rightAnswers++;
        } while (rightAnswers < 3);
        System.out.println("Congratulations, " + nameUser + "!");
    }

    public static String isEven(int number) {
        return number % 2 == 0 ? "yes" : "no";
    }
}
