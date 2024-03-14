package com.interviewquestionsanswers.strings;

public class RepeatedStringHacker {
    public static void main(String[] args) {
        String s = "aba";
        long n = 10;
        long result = repeatedString(s, n);
        System.out.println("Frequency of 'a' in the first " + n + " characters: " + result);
    }

    public static long repeatedString(String s, long n) {
        long countOfA = 0;

        // Count occurrences of 'a' in the given string 's'
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a') {
                countOfA++;
            }
        }

        // Calculate number of complete repetitions of string 's' in first 'n' characters
        long repetitions = n / s.length();

        // Calculate remaining characters after complete repetitions
        long remainingChars = n % s.length();

        // Count occurrences of 'a' in the remaining characters
        for (int i = 0; i < remainingChars; i++) {
            if (s.charAt(i) == 'a') {
                countOfA++;
            }
        }

        // Total count of 'a's in the first 'n' characters
        return countOfA + repetitions + remainingChars;
    }
}

