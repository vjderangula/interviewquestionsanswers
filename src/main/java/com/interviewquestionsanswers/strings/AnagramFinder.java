package com.interviewquestionsanswers.strings;

import java.util.Arrays;

public class AnagramFinder {
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
		// Check if the lengths of the strings are equal
		if (str1.length() != str2.length()) {
			return false;
		}
		// Convert the strings to char arrays and sort them
		char[] charArray1 = str1.toCharArray();
		char[] charArray2 = str2.toCharArray();
		Arrays.sort(charArray1);
		Arrays.sort(charArray2);
		// Compare the sorted char arrays
		return Arrays.equals(charArray1, charArray2);
	}
}

/*
 * 
 * You can find string anagrams in Java by comparing the sorted versions of the
 * strings. If two strings are anagrams, they will have the same characters with
 * the same frequency, which means their sorted versions will be identical.
 * Here's a program to find string anagrams:
 * 
 * ```java import java.util.Arrays;
 * 
 * public class AnagramFinder { public static void main(String[] args) { String
 * str1 = "listen"; String str2 = "silent";
 * 
 * if (areAnagrams(str1, str2)) { System.out.println(str1 + " and " + str2 +
 * " are anagrams."); } else { System.out.println(str1 + " and " + str2 +
 * " are not anagrams."); } }
 * 
 * public static boolean areAnagrams(String str1, String str2) { // Check if the
 * lengths of the strings are equal if (str1.length() != str2.length()) { return
 * false; }
 * 
 * // Convert the strings to char arrays and sort them char[] charArray1 =
 * str1.toCharArray(); char[] charArray2 = str2.toCharArray();
 * 
 * Arrays.sort(charArray1); Arrays.sort(charArray2);
 * 
 * // Compare the sorted char arrays return Arrays.equals(charArray1,
 * charArray2); } } ```
 * 
 * This program demonstrates how to check if two strings (`str1` and `str2`) are
 * anagrams.
 * 
 * - We define a method `areAnagrams` that takes two strings as input and
 * returns `true` if they are anagrams and `false` otherwise. - Inside the
 * `areAnagrams` method, we first check if the lengths of the strings are equal.
 * If they are not equal, they cannot be anagrams, so we return `false`. - We
 * then convert the strings to char arrays using the `toCharArray` method and
 * sort them using `Arrays.sort`. - Finally, we compare the sorted char arrays
 * using `Arrays.equals`. If they are equal, we return `true`, indicating that
 * the strings are anagrams. Otherwise, we return `false`.
 */
