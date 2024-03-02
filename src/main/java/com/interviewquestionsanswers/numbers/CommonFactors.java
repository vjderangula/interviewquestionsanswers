package com.interviewquestionsanswers.numbers;

import java.util.Scanner;

public class CommonFactors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input two numbers
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        // Find common factors
        System.out.println("Common factors of " + num1 + " and " + num2 + ":");
        findCommonFactors(num1, num2);

        scanner.close();
    }

    public static void findCommonFactors(int num1, int num2) {
        int min = Math.min(num1, num2);
        for (int i = 1; i <= min; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}

