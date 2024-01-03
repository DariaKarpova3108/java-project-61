package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Prime {
    public static void playPrimeGame() {
        String description = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        final int linesCount = 3;
        final int columnsCount = 2;
        final int sizeNumber = 100;
        String[][] task = new String[linesCount][columnsCount];
        Random rand = new Random();
        for (int i = 0; i < task.length; i++) {
            int number = rand.nextInt(sizeNumber);
            task[i][0] = Integer.toString(number);

            if (number < 2) {
                task[i][1] = "no";
            } else if (number == 2) {
                task[i][1] = "yes";
            } else if (number % 2 == 0) {
                task[i][1] = "no";
            } else {
                boolean isPrime = true;
                final int initialValue = 3;
                for (int k = initialValue; k <= Math.sqrt(number); k++) {
                    if (number % k == 0) {
                        isPrime = false;
                        break;
                    }
                }
                task[i][1] = isPrime ? "yes" : "no";
            }
        }
        Engine.run(description, task);
    }
}


