package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class GCD {
    public static void playGcd() {
        String description = "Find the greatest common divisor of given numbers.";
        final int linesCount = 3;
        final int columnsCount = 2;
        String[][] task = new String[linesCount][columnsCount];
        Random rand = new Random();
        for (int i = 0; i < task.length; i++) {
            final int sizeNumber = 50;
            int numberOne = rand.nextInt(sizeNumber);
            int numberTwo = rand.nextInt(sizeNumber);
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
