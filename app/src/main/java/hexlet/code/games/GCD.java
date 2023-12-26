package hexlet.code.games;

import java.util.Random;
import java.util.Scanner;

public class GCD {
    public static void playGcd() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!\n" +
                "May I have your name? ");
        String nameUser = scan.nextLine();
        System.out.println("Hello, " + nameUser + "!");
        int count = 0;
        Random rand = new Random();
        System.out.println("Find the greatest common divisor of given numbers. ");
        do {
            int numberOne = rand.nextInt(100) + 1;
            int numberTwo = rand.nextInt(100) + 1;
            System.out.println("Question: " + numberOne + " " + numberTwo);
            int answer = scan.nextInt();
            System.out.println("Your answer: " + answer);
            int Gcd = findGcd(numberOne, numberTwo);
            if (!(answer == Gcd)) {
                System.out.println("Your answer: " + answer + "\n" +
                        "'" + answer + "'" + "is wrong answer ;(. Correct answer was '" + Gcd + "'.\n" +
                        "Let's try again, " + nameUser + "!");
                return;
            } else {
                System.out.println("Correct!");
                count++;
            }
        } while (count < 3);
        System.out.println("Congratulations, " + nameUser + "!");
    }

    public static int findGcd(int numberOne, int numberTwo) {
        while (numberTwo != 0) {
            int tmp = numberTwo;
            numberTwo = numberOne % numberTwo;
            numberOne = tmp;
        }
        int Gcd = numberOne;
        return Gcd;
    }
}
