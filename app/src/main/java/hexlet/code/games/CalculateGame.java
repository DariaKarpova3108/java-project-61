package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class CalculateGame {
    public static void playCalculate() {
        Random rand = new Random();
        String description = "What is the result of the expression?";
        int countOfLines = 3;
        int countOfColumns = 2;
        String[][] task = new String[countOfLines][countOfColumns];
        String[] operation = {"+", "-", "*"};

        for (int i = 0; i < task.length; i++) {
            int maxSize = 10;
            int numberOne = rand.nextInt(maxSize);
            int numberTwo = rand.nextInt(maxSize);
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

