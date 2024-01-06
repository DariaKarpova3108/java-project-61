package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class EvenGame {
    public static final int MAX_SIZE = 100;
    public static final int COLUMNS_COUNT = 2;

    public static void playEvenGame() {
        final String description = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        String[][] rounds = new String[Engine.GENERAL_RIGHT_COUNT_ANSWER][COLUMNS_COUNT];
        for (int i = 0; i < rounds.length; i++) {
            rounds[i] = generateRoundData();
        }
        Engine.run(description, rounds);
    }

    private static String[] generateRoundData() {
        String[] round = new String[COLUMNS_COUNT];
        int number = Utils.generateNumber(MAX_SIZE);
        round[0] = Integer.toString(number);
        var answer = isEven(number) ? "yes" : "no";
        round[1] = answer;
        return round;
    }

    private static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
