package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class CalculateGame {
    public static void playCalculate() {
        Random rand = new Random();
        String description = "What is the result of the expression?";
        final int linesCount = 3;
        final int columnsCount = 2;
        final int sizeNumber = 10;
        String[][] task = new String[linesCount][columnsCount];
        for (int i = 0; i < task.length; i++) {
            int firstNumber = rand.nextInt(sizeNumber);
            int secondNumber = rand.nextInt(sizeNumber);
            String operation = getOperation();
            String question = firstNumber + " " + operation + " " + secondNumber;
            int answer = calculate(firstNumber, secondNumber, operation);
            task[i][0] = question;
            task[i][1] = Integer.toString(answer);
        }
        Engine.run(description, task);
    }

    private static int calculate(int numberOne, int numberTwo, String operation) {
        int result = 0;
        switch (operation) {
            case "+":
                result = numberOne + numberTwo;
                break;
            case "-":
                result = numberOne - numberTwo;
                break;
            case "*":
                result = numberOne * numberTwo;
                break;
            default:
                System.out.println("Incorrect operation. Please choose the correct mathematical operation.");
        }
        return result;
    }

    private static String getOperation() {
        Random rand = new Random();
        String[] operation = {"+", "-", "*"};
        int operationIndex = rand.nextInt(operation.length);
        return operation[operationIndex];
    }
}