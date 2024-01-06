package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class CalculateGame {

    public static final int SIZE = 10;
    public static final String[] OPERATION = new String[]{"+", "-", "*"};
    public static final int COLUMNS_COUNT = 2;

    public static void playCalculate() {
        final String description = "What is the result of the expression?";
        String[][] rounds = new String[Engine.GENERAL_RIGHT_COUNT_ANSWER][COLUMNS_COUNT];
        for (int i = 0; i < rounds.length; i++) {
            rounds[i] = generateRoundData();
        }
        Engine.run(description, rounds);
    }

    private static int calculate(int numberFirst, int numberSecond, String operation) {
        return switch (operation) {
            case "+" -> numberFirst + numberSecond;
            case "-" -> numberFirst - numberSecond;
            case "*" -> numberFirst * numberSecond;
            default -> throw new RuntimeException("Incorrect operation. \n"
                    + "Please choose the correct mathematical operation.");
        };
    }

    private static String[] generateRoundData() {
        String[] round = new String[COLUMNS_COUNT];
        int numberFirst = Utils.generateNumber(SIZE);
        int numberSecond = Utils.generateNumber(SIZE);
        String operation = OPERATION[Utils.generateNumber(OPERATION.length)];
        String question = numberFirst + " " + operation + " " + numberSecond;
        var answer = calculate(numberFirst, numberSecond, operation);
        round[0] = question;
        round[1] = Integer.toString(answer);
        return round;
    }
}
