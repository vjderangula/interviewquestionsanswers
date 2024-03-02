package com.interviewquestionsanswers.numbers;

import java.util.Scanner;

public class LeastCommonMultiple {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input two numbers
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        // Find and print LCM
        int lcm = findLCM(num1, num2);
        System.out.println("Least Common Multiple (LCM) of " + num1 + " and " + num2 + " is: " + lcm);

        scanner.close();
    }

    public static int findLCM(int num1, int num2) {
        // LCM(a, b) = (a * b) / GCD(a, b)
        return (num1 * num2) / findGCD(num1, num2);
    }

    public static int findGCD(int num1, int num2) {
        // Euclidean algorithm to find GCD
        while (num2 != 0) {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        return num1;
    }
}

