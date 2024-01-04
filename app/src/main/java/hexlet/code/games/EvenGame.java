package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class EvenGame {

    public static final int MAX_SIZE = 100;

    public static void playEvenGame() {
        final String description = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        final int columnsCount = 2;
        String[][] rounds = new String[Engine.GENERAL_RIGHT_COUNT_ANSWER][columnsCount];
        for (int i = 0; i < rounds.length; i++) {
            rounds[i] = generateRoundData();
        }
        Engine.run(description, rounds);
    }

    private static String[] generateRoundData() {
        String[] round = new String[2];
        int number = Utils.generateNumber(MAX_SIZE);
        round[0] = Integer.toString(number);
        if (Integer.parseInt(round[0]) % 2 == 0) {
            round[1] = "yes";
        } else {
            round[1] = "no";
        }
        return round;
    }
}
