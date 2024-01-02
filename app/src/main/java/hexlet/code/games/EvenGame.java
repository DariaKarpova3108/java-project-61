package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;


public class EvenGame {
    public static void playEvenGame() {
        String description = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        Random rand = new Random();
        String[][] task = new String[3][2];
        for (int i = 0; i < task.length; i++) {
            task[i][0] = Integer.toString(rand.nextInt(100) + 1);
            if (Integer.parseInt(task[i][0]) % 2 == 0) {
                task[i][1] = "yes";
            } else {
                task[i][1] = "no";
            }
        }
        Engine.run(description, task);
    }
}
