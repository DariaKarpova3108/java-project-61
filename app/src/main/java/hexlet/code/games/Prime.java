package hexlet.code.games;

import java.util.Random;
import java.util.Scanner;

public class Prime {
    public static void playPrimeGame() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!\n" +
                "May I have your name? ");
        String nameUser = scan.nextLine();
        System.out.println("Hello, " + nameUser + "!");
        int count = 0;
        Random rand = new Random();
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'. ");
        do {
            int number = rand.nextInt(100) + 1;
            System.out.println("Question: " + number);
            String answer = scan.nextLine();
            System.out.println("Your answer: " + answer);
            if (!(answer.equals(isPrime(number)))) {
                System.out.println("Your answer: " + answer + "\n" +
                        "'" + answer + "'" + "is wrong answer ;(. Correct answer was '" + isPrime(number) + "'.\n" +
                        "Let's try again, " + nameUser + "!");
                return;
            } else {
                System.out.println("Correct!");
                count++;
            }
        } while (count < 3);
        System.out.println("Congratulations, " + nameUser + "!");
    }

    public static String isPrime(int number) {
        if (number < 2) {
            return "no";
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return "no";
            }
        }
        return "yes";
    }
}


