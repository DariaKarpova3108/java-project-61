package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class CalculateGame {

    public static final int SIZE = 10;
    public static final String[] OPERATION = new String[]{"+", "-", "*"};

    public static void playCalculate() {
        final String description = "What is the result of the expression?";
        final int columnsCount = 2;
        String[][] rounds = new String[Engine.GENERAL_RIGHT_COUNT_ANSWER][columnsCount];
        for (int i = 0; i < rounds.length; i++) {
            rounds[i] = generateRoundData();
        }
        Engine.run(description, rounds);
    }

    private static int getAnswer(int numberFirst, int numberSecond, String operation) {
        return switch (operation) {
            case "+" -> numberFirst + numberSecond;
            case "-" -> numberFirst - numberSecond;
            case "*" -> numberFirst * numberSecond;
            default ->
                    throw new RuntimeException("Incorrect operation. \n"
                            +"Please choose the correct mathematical operation.");
        };
    }

    private static String[] generateRoundData() {
        String[] round = new String[2];
        int numberFirst = Utils.generateNumber(SIZE);
        int numberSecond = Utils.generateNumber(SIZE);
        String operation = OPERATION[Utils.generateNumber(OPERATION.length)];
        String question = numberFirst + " " + operation + " " + numberSecond;

        var answer = getAnswer(numberFirst, numberSecond, operation);

        round[0] = question;
        round[1] = Integer.toString(answer);
        return round;
    }
}
