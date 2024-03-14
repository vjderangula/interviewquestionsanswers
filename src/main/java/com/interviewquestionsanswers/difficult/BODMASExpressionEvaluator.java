package com.interviewquestionsanswers.difficult;

import java.util.Stack;

public class BODMASExpressionEvaluator {
    public static void main(String[] args) {
        String input = "(2+5*5-16/8)+(6+9/3+7*2)";
        double result = evaluateExpression(input);
        System.out.println("Result: " + result);
    }

    public static double evaluateExpression(String input) {
        // Remove all white spaces from the input string
        input = input.replaceAll("\\s+", "");

        Stack<Double> numbers = new Stack<>();
        Stack<Character> operations = new Stack<>();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            if (Character.isDigit(c)) {
                // Extract the number
                StringBuilder sb = new StringBuilder();
                while (i < input.length() && Character.isDigit(input.charAt(i))) {
                    sb.append(input.charAt(i++));
                }
                i--; // Move back one step as the loop will move forward again

                // Push the extracted number to the numbers stack
                numbers.push(Double.parseDouble(sb.toString()));
            } else if (c == '(') {
                // Push opening bracket to operations stack
                operations.push(c);
            } else if (c == ')') {
                // Evaluate expression until corresponding opening bracket is found
                while (operations.peek() != '(') {
                    double num2 = numbers.pop();
                    double num1 = numbers.pop();
                    char operation = operations.pop();
                    numbers.push(applyOperation(num1, num2, operation));
                }
                operations.pop(); // Pop the '(' bracket
            } else if (c == '+' || c == '-' || c == '*' || c == '/') {
                // Evaluate expressions based on precedence
                while (!operations.isEmpty() && hasPrecedence(c, operations.peek())) {
                    double num2 = numbers.pop();
                    double num1 = numbers.pop();
                    char operation = operations.pop();
                    numbers.push(applyOperation(num1, num2, operation));
                }
                // Push the current operator to the operations stack
                operations.push(c);
            }
        }

        // Evaluate remaining expressions in stacks
        while (!operations.isEmpty()) {
            double num2 = numbers.pop();
            double num1 = numbers.pop();
            char operation = operations.pop();
            numbers.push(applyOperation(num1, num2, operation));
        }

        // The final result will be at the top of the numbers stack
        return numbers.pop();
    }

    // Method to check if operation1 has higher or equal precedence than operation2
    public static boolean hasPrecedence(char operation1, char operation2) {
        if ((operation1 == '*' || operation1 == '/') && (operation2 == '+' || operation2 == '-')) {
            return true;
        }
        return false;
    }

    // Method to apply the given operation on the two numbers
    public static double applyOperation(double num1, double num2, char operation) {
        switch (operation) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                if (num2 == 0) {
                    throw new ArithmeticException("Division by zero!");
                }
                return num1 / num2;
            default:
                return 0;
        }
    }
}
