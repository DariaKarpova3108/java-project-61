package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import java.util.Random;

public class ProgressionGame {
    public static final int STEP_SIZE = 10;
    public static final int MIN_LENGTH = 5;
    public static final int MAX_LENGTH = 10;
    public static final int START_NUMBER = 50;

    public static void playProgression() {
        final String description = "What number is missing in the progression?";
        final int columnsCount = 2;
        String[][] rounds = new String[Engine.GENERAL_RIGHT_COUNT_ANSWER][columnsCount];
        for (int i = 0; i < rounds.length; i++) {
            rounds[i] = generateRoundData();
        }
        Engine.run(description, rounds);
    }

    private static String[] generateRoundData() {
        Random rand = new Random();
        String[] round = new String[2];
        int length = rand.nextInt(MIN_LENGTH, MAX_LENGTH);
        String[] progression = new String[length];
        int start = Utils.generateNumber(START_NUMBER);
        int step = Utils.generateNumber(STEP_SIZE);
        for (int i = 0; i < progression.length; i++) {
            progression[i] = String.valueOf(start + i * step);
        }
        int missingIndex = Utils.generateNumber(length);
        String missingNumber = progression[missingIndex];
        progression[missingIndex] = "..";
        round[0] = String.join(" ", progression);
        round[1] = missingNumber;
        return round;
    }
}
