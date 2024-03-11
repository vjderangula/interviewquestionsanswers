package com.interviewquestionsanswers.strings;

import java.util.Arrays;
import java.util.stream.Collectors;

public class AnagramCheckerJava8 {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";
        
        if (areAnagrams(str1, str2)) {
            System.out.println(str1 + " and " + str2 + " are anagrams.");
        } else {
            System.out.println(str1 + " and " + str2 + " are not anagrams.");
        }
    }
    
    public static boolean areAnagrams(String str1, String str2) {
        // Convert the strings to lowercase and remove whitespace
        str1 = str1.toLowerCase().replaceAll("\\s", "");
        str2 = str2.toLowerCase().replaceAll("\\s", "");
        
        // Sort the characters of the strings and compare them
        return Arrays.stream(str1.split(""))
                     .sorted()
                     .collect(Collectors.joining())
                     .equals(Arrays.stream(str2.split(""))
                                   .sorted()
                                   .collect(Collectors.joining()));
    }
}

