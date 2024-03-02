package com.interviewquestionsanswers.numbers;

import java.util.Scanner;

public class HighestCommonFactor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input two numbers
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        // Find and print HCF
        int hcf = findHCF(num1, num2);
        System.out.println("Highest Common Factor (HCF) of " + num1 + " and " + num2 + " is: " + hcf);

        scanner.close();
    }

    public static int findHCF(int num1, int num2) {
        // Euclidean algorithm
        while (num2 != 0) {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        return num1;
    }
}

