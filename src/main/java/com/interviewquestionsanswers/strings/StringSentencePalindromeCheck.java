package com.interviewquestionsanswers.strings;

public class StringSentencePalindromeCheck {

	public static void main(String[] args) {

		String input = "this is your dad and i use liril";
		String[] word = input.split(" ");
	for (String string2 : word) {
		
		if(isPalindrome(string2)) {
			System.out.println(string2+" is a Palindrome ");
		}
		
	}
		
	}
	public static boolean isPalindrome(String str) {
		int i1=0;
		int i2=str.length() -1;
		
		while(i2 > i1) {
			
			if(str.charAt(i1) != str.charAt(i2)) {
				return false;
			}
			i1++;
			i2--;
	}
		return true;
	}
}
