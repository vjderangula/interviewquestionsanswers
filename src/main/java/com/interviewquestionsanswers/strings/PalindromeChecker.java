package com.interviewquestionsanswers.strings;

import java.util.Scanner;
public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);        
        // Input the word
        System.out.print("Enter a word: ");
        String word = scanner.nextLine().toLowerCase(); // Convert to lowercase for case-insensitive comparison        
        // Check if the word is a palindrome
        boolean isPalindrome = isPalindrome(word);        
        // Print the result
        if (isPalindrome) {
            System.out.println("The word \"" + word + "\" is a palindrome.");
        } else {
            System.out.println("The word \"" + word + "\" is not a palindrome.");
        }        
        scanner.close();
    }    
    public static boolean isPalindrome(String word) {
        int left = 0;
        int right = word.length() - 1;        
        while (left < right) {
            if (word.charAt(left) != word.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }        
        return true;
    }
}
