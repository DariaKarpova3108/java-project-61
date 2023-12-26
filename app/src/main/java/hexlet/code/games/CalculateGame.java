package hexlet.code.games;

import java.util.Random;
import java.util.Scanner;

public class CalculateGame {
    public static void playCalculate() {
        System.out.print("Welcome to the Brain Games!\n" +
                "May I have your name? ");
        Scanner scan = new Scanner(System.in);
        String nameUser = scan.nextLine();
        System.out.println("Hello, " + nameUser + "!");
        System.out.println("What is the result of the expression?");
        int rightAnswers = 0;
        do {
            System.out.print("Question: " );
            int value = getValue();
            int answer = scan.nextInt();
            System.out.println("Your answer: " + answer);
            if (!(answer == value)) {
                System.out.println("Your answer: " + answer + "\n" +
                        "'" + answer + "'" + "is wrong answer ;(. Correct answer was '" + value + "'.\n" +
                        "Let's try again, " + nameUser + "!");
                return;
            } else {
                System.out.println("Correct!");
                rightAnswers++;
            }
        } while (rightAnswers < 3);
        System.out.println("Congratulations, " + nameUser + "!");
    }

    public static int getValue() {
        Random random = new Random();
        int numberOne = random.nextInt(100) + 1;
        int numberTwo = random.nextInt(100) + 1;
        boolean operation = random.nextBoolean();
        int result = 0;
        if (operation) {
            result = numberOne + numberTwo;
            System.out.println(numberOne + " + " + numberTwo);
        } else {
            result = numberOne - numberTwo;
            System.out.println(numberOne + " - " + numberTwo);
        }
        return result;
    }
}

