package com.interviewquestionsanswers.strings;

public class StringNumberPrint {

	public static void main(String[] args) {

		// input = a2b5c2
		// output = aabbbbbcc
		
		String s1 = "a2b5c2";
		
		for (int i=0; i< s1.length();i++) {
			
			if(Character.isAlphabetic(s1.charAt(i))) {
				System.out.print(s1.charAt(i));
			}else {
				int x = Character.getNumericValue(s1.charAt(i));
				for(int j=1; j<x;j++) {
					System.out.print(s1.charAt(i-1));
				}
			}
		}
	}

}
