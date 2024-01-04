package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class GCD {

    public static final int SIZE = 50;

    public static void playGcd() {
        final String description = "Find the greatest common divisor of given numbers.";
        final int columnsCount = 2;
        String[][] rounds = new String[Engine.GENERAL_RIGHT_COUNT_ANSWER][columnsCount];
        for (int i = 0; i < rounds.length; i++) {
            rounds[i] = generateRoundData();
        }
        Engine.run(description, rounds);
    }

    private static int getGCD(int numberOne, int numberTwo) {
        while (numberTwo != 0) {
            int tmp = numberTwo;
            numberTwo = numberOne % numberTwo;
            numberOne = tmp;
        }
        return numberOne;
    }

    private static String[] generateRoundData() {
        String[] round = new String[2];
        int numberOne = Utils.generateNumber(SIZE);
        int numberTwo = Utils.generateNumber(SIZE);
        round[0] = numberOne + " " + numberTwo;
        numberOne = getGCD(numberOne, numberTwo);
        round[1] = String.valueOf(numberOne);
        return round;
    }
}
