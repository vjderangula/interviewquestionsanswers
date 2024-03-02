package com.interviewquestionsanswers.numbers;

import java.util.Scanner;

public class HCF_LCM_GCF_Recursive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input two numbers
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        // Calculate and print HCF, LCM, and GCF
        int hcf = findHCF(num1, num2);
        int lcm = findLCM(num1, num2, hcf);
        int gcf = hcf;

        System.out.println("HCF of " + num1 + " and " + num2 + " is: " + hcf);
        System.out.println("LCM of " + num1 + " and " + num2 + " is: " + lcm);
        System.out.println("GCF of " + num1 + " and " + num2 + " is: " + gcf);

        scanner.close();
    }

    // Method to find HCF using Euclidean algorithm recursively
    public static int findHCF(int num1, int num2) {
        if (num2 == 0) {
            return num1;
        } else {
            return findHCF(num2, num1 % num2);
        }
    }

    // Method to find LCM using HCF
    public static int findLCM(int num1, int num2, int hcf) {
        return (num1 * num2) / hcf;
    }
}

