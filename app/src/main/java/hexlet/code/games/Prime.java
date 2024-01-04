package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {
    public static final int SIZE_NUMBER = 100;

    public static void playPrimeGame() {
        final String description = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        final int columnsCount = 2;
        String[][] rounds = new String[Engine.GENERAL_RIGHT_COUNT_ANSWER][columnsCount];

        for (int i = 0; i < rounds.length; i++) {
            rounds[i] = generateRoundData();
        }
        Engine.run(description, rounds);
    }

    private static String[] generateRoundData() {
        String[] round = new String[2];
        int number = Utils.generateNumber(SIZE_NUMBER);
        round[0] = Integer.toString(number);
        if (number < 2) {
            round[1] = "no";
        } else if (number == 2) {
            round[1] = "yes";
        } else if (number % 2 == 0) {
            round[1] = "no";
        } else {
            boolean isPrime = true;
            final int initialValue = 3;
            for (int k = initialValue; k <= Math.sqrt(number); k++) {
                if (number % k == 0) {
                    isPrime = false;
                    break;
                }
            }
            round[1] = isPrime ? "yes" : "no";
        }
        return round;
    }
}


