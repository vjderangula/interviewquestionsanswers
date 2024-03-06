package com.interviewquestionsanswers.strings;

public class LongestPalindromicSubstring {
	public static void main(String[] args) {
		/*
		 * To find the longest palindromic substring in a given string, we can use a
		 * dynamic programming approach. We'll iterate through the string and for each
		 * character, we'll expand around it to check if it forms a palindrome. We'll
		 * keep track of the longest palindrome found so far. Here's the Java code to
		 * achieve this
		 */
		String input = "itititipolastrh";// "abhhjjjghgjjjhhhjjiiuumv";
		String longestPalindrome = findLongestPalindrome(input);
		System.out.println("Longest palindromic substring: " + longestPalindrome);
	}

	public static String findLongestPalindrome(String s) {
		if (s == null || s.length() < 1)
			return "";
		int start = 0, end = 0;
		for (int i = 0; i < s.length(); i++) {
			int len1 = expandAroundCenter(s, i, i);
			int len2 = expandAroundCenter(s, i, i + 1);
			int len = Math.max(len1, len2);
			if (len > end - start) {
				start = i - (len - 1) / 2;
				end = i + len / 2;
			}
		}
		return s.substring(start, end + 1);
	}

	private static int expandAroundCenter(String s, int left, int right) {
		while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
			left--;
			right++;
		}
		return right - left - 1;
	}
	/*
	 * Explanation:
	 * 
	 * We iterate through each character of the string and treat it as a potential
	 * center of a palindrome. We then expand around each center (either single
	 * character or two consecutive characters) to find the longest palindrome
	 * centered at that position. We keep track of the start and end indices of the
	 * longest palindrome found so far. After iterating through all characters, we
	 * return the substring corresponding to the longest palindrome. This algorithm
	 * has a time complexity of O(n^2) since we have nested loops to iterate through
	 * the string and expand around each character. However, since we are only
	 * expanding for palindromes, the actual number of expansions is much smaller
	 * than n^2 in most cases, resulting in an efficient solution.
	 */
}
