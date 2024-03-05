package com.interviewquestionsanswers.strings;

public class StringDuplicatesOldenDays {

	public static void main(String[] args) {
				
		String dupString = "Welcome to Java";
		String str =dupString.replace(" ", "");
		System.out.println(str);
		
		char[] charset = str.toCharArray();
		
		for(int i=0; i<str.length();i++) {
			
			for(int j=i+1; j<str.length();j++) {
				
				if(charset[i] == charset[j]) {
					
					System.out.println("Duplicate Letter is :: "+ charset[j]);
					
					break;
				
				}
			}
		}

	}

}
