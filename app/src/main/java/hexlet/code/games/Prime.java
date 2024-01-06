package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {
    public static final int SIZE_NUMBER = 100;
    public static final int COLUMNS_COUNT = 2;

    public static void playPrimeGame() {
        final String description = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        String[][] rounds = new String[Engine.GENERAL_RIGHT_COUNT_ANSWER][COLUMNS_COUNT];

        for (int i = 0; i < rounds.length; i++) {
            rounds[i] = generateRoundData();
        }
        Engine.run(description, rounds);
    }

    private static String[] generateRoundData() {
        String[] round = new String[COLUMNS_COUNT];
        int number = Utils.generateNumber(SIZE_NUMBER);
        round[0] = Integer.toString(number);
        round[1] = isPrime(number) ? "yes" : "no";
        return round;
    }

    private static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        } else if (number == 2) {
            return true;
        } else if (number % 2 == 0) {
            return false;
        } else {
            final int initialValue = 3;
            for (int k = initialValue; k <= Math.sqrt(number); k++) {
                if (number % k == 0) {
                    return false;
                }
            }
        }
        return true;
    }
}


