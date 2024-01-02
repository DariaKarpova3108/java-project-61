package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class GCD {
    public static void playGcd() {
        String description = "Find the greatest common divisor of given numbers.";
        String[][] task = new String[3][2];
        Random rand = new Random();
        for (int i = 0; i < task.length; i++) {
            int numberOne = rand.nextInt(100) + 1;
            int numberTwo = rand.nextInt(100) + 1;
            task[i][0] = numberOne + " " + numberTwo;

            while (numberTwo != 0) {
                int tmp = numberTwo;
                numberTwo = numberOne % numberTwo;
                numberOne = tmp;
            }
            task[i][1] = String.valueOf(numberOne);
        }
        Engine.run(description, task);
    }
}
