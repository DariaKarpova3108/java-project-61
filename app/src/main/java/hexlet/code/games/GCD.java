package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class GCD {
    public static void playGcd() {
        String description = "Find the greatest common divisor of given numbers.";
        int countOfLines = 3;
        int countOfColumns = 2;
        String[][] task = new String[countOfLines][countOfColumns];
        Random rand = new Random();
        for (int i = 0; i < task.length; i++) {
            int maxSizeNumber = 50;
            int numberOne = rand.nextInt(maxSizeNumber);
            int numberTwo = rand.nextInt(maxSizeNumber);
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
