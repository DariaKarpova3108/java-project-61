package hexlet.code.games;

import java.util.Random;
import java.util.Scanner;

public class ProgressionGame {
    public static void playProgression() {
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!\n" +
                "May I have your name? ");
        String nameUser = scan.nextLine();
        System.out.println("Hello, " + nameUser + "!");
        int count = 0;
        System.out.println("What number is missing in the progression?");
        do {
            int[] progression = writeProgression();
            int missedIndex = rand.nextInt(progression.length);
            int missedNumber = progression[missedIndex];
            System.out.print("Question: ");
            for (int i = 0; i < progression.length; i++) {
                if (i == missedIndex) {
                    System.out.print(".." + " ");
                } else {
                    System.out.print(progression[i] + " ");
                }
            }
            int answer = scan.nextInt();
            System.out.println("Your answer: " + answer);
            if (!(answer == missedNumber)) {
                System.out.println("Your answer: " + answer + "\n" +
                        "'" + answer + "'" + "is wrong answer ;(. Correct answer was '" + missedNumber + "'.\n" +
                        "Let's try again, " + nameUser + "!");
                return;
            } else {
                System.out.println("Correct!");
                count++;
            }
        } while (count < 3);
        System.out.println("Congratulations, " + nameUser + "!");
    }

    public static int[] writeProgression() {
        Random rand = new Random();
        int length = rand.nextInt(5) + 6;
        int[] array = new int[length];
        int start = rand.nextInt(50);
        int step = rand.nextInt(10) + 1;
        for (int i = 0; i < array.length; i++) {
            array[i] = start + i * step;
        }
        return array;
    }
}
