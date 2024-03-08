package com.interviewquestionsanswers.strings;

import java.util.Arrays;

public class CharacterSeparation {
    public static void main(String[] args) {
        String[] input = {"A55@", "41#G", "%S87", "30$F", "T93*"};
        
        // Initialize arrays to store alphabets, numbers, and special characters
        char[] alphabets = new char[input.length];
        char[] numbers = new char[input.length];
        char[] specialChars = new char[input.length];
        
        // Iterate through each string in the input array
        for (int i = 0; i < input.length; i++) {
            String str = input[i];
            for (char c : str.toCharArray()) {
                // Check if the character is an alphabet, number, or special character
                if (Character.isLetter(c)) {
                    alphabets[i] = c;
                } else if (Character.isDigit(c)) {
                    numbers[i] = c;
                } else {
                    specialChars[i] = c;
                }
            }
        }
        
        // Sort the arrays
        Arrays.sort(alphabets);
        Arrays.sort(numbers);
        Arrays.sort(specialChars);
        
        // Print the sorted arrays
        System.out.println("Sorted Alphabets: " + Arrays.toString(alphabets));
        System.out.println("Sorted Numbers: " + Arrays.toString(numbers));
        System.out.println("Sorted Special Characters: " + Arrays.toString(specialChars));
    }
}

