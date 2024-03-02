package com.interviewquestionsanswers.numbers;

import java.util.Scanner;

public class HCF_LCM_GCF {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input two numbers
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        // Calculate and print HCF, LCM, and GCF
        int hcf = findHCF(num1, num2);
        int lcm = findLCM(num1, num2);
        int gcf = findGCF(num1, num2);

        System.out.println("HCF of " + num1 + " and " + num2 + " is: " + hcf);
        System.out.println("LCM of " + num1 + " and " + num2 + " is: " + lcm);
        System.out.println("GCF of " + num1 + " and " + num2 + " is: " + gcf);

        scanner.close();
    }

    // Method to find HCF using Euclidean algorithm
    public static int findHCF(int num1, int num2) {
        while (num2 != 0) {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        return num1;
    }

    // Method to find LCM using HCF
    public static int findLCM(int num1, int num2) {
        int hcf = findHCF(num1, num2);
        return (num1 * num2) / hcf;
    }

    // Method to find GCF (same as HCF)
    public static int findGCF(int num1, int num2) {
        return findHCF(num1, num2);
    }
}
