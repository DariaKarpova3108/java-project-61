package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class ProgressionGame {
    public static void playProgression() {
        String description = "What number is missing in the progression?";
        int countOfLines = 3;
        int countOfColumns = 2;
        String[][] task = new String[countOfLines][countOfColumns];
        Random rand = new Random();
        int maxStartNumber = 50;
        int maxLengthOfStep = 10;
        for (int i = 0; i < task.length; i++) {
            int length = rand.nextInt(5, 10);
            String[] array = new String[length];
            int start = rand.nextInt(maxStartNumber);
            int step = rand.nextInt(maxLengthOfStep);
            for (int k = 0; k < array.length; k++) {
                array[k] = String.valueOf(start + k * step);
            }
            int missingIndex = rand.nextInt(length);
            String missingNumber = array[missingIndex];
            array[missingIndex] = "..";
            task[i][0] = String.join(" ", array);
            task[i][1] = missingNumber;
        }
        Engine.run(description, task);
    }
}
