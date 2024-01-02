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
            int numberOne = rand.nextInt(100) + 1;
            int numberTwo = rand.nextInt(100) + 1;
            int operationIndex = rand.nextInt(operation.length);
            switch (operation[operationIndex]) {
                case "+" -> task[i][0] = numberOne + " + " + numberTwo;

                case "-" -> task[i][0] = numberOne + " - " + numberTwo;
                case "*" -> task[i][0] = numberOne + " * " + numberTwo;
            }
            int result = 0;
            switch (operation[operationIndex]) {
                case "+" -> result = numberOne + numberTwo;

                case "-" -> result = numberOne - numberTwo;
                case "*" -> result = numberOne * numberTwo;
            }
            task[i][1] = Integer.toString(result);
        }
        Engine.run(description, task);
    }
}

