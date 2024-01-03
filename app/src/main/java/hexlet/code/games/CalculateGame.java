package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class CalculateGame {
    public static void playCalculate() {
        Random rand = new Random();
        String description = "What is the result of the expression?";
        final int LINES = 3;
        final int COLUMNS = 2;
        final int SIZE = 10;
        String[][] task = new String[LINES][COLUMNS];
        String[] operation = {"+", "-", "*"};

        for (int i = 0; i < task.length; i++) {
            int numberOne = rand.nextInt(SIZE);
            int numberTwo = rand.nextInt(SIZE);
            int operationIndex = rand.nextInt(operation.length);
            switch (operation[operationIndex]) {
                case "+" -> task[i][0] = numberOne + " + " + numberTwo;

                case "-" -> task[i][0] = numberOne + " - " + numberTwo;
                case "*" -> task[i][0] = numberOne + " * " + numberTwo;
                default -> System.out.println("Incorrect operation. Please choose the correct mathematical operation.");
            }
            int result = 0;
            switch (operation[operationIndex]) {
                case "+" -> result = numberOne + numberTwo;
                case "-" -> result = numberOne - numberTwo;
                case "*" -> result = numberOne * numberTwo;
                default -> System.out.println("Incorrect result.");
            }
            task[i][1] = Integer.toString(result);
        }
        Engine.run(description, task);
    }
}

