package com.interviewquestionsanswers;

public class ConsecutiveChars {
	public static void main(String[] args) {
		String input = "aabbcccaaagghh";
		findConsecutiveChars(input);
	}
	public static void findConsecutiveChars(String input) {
		char[] chars = input.toCharArray();
		char prevChar = chars[0];
		int count = 1;
		for (int i = 1; i < chars.length; i++) {
			if (chars[i] == prevChar) {
				count++;
			} else {
				System.out.print(prevChar + "-" + count + "\t");
				prevChar = chars[i];
				count = 1;
			}
		}
		// Print the last consecutive sequence
		System.out.println(prevChar + "-" + count);
	}
}
