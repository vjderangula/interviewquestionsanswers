package com.interviewquestionsanswers.strings;

import java.util.Arrays;

public class StringAnagram {
	public static void main(String[] args) {
		//angel = glean //bored = robed //cat = act //cider = cried //dusty = study		
		String str1 = "angel";
		String str2 = "glean";		
		if(str1.length() == str2.length()) {			
		char[] char1 = str1.toLowerCase().toCharArray();		
		char[] char2 = str2.toLowerCase().toCharArray(); 		
		Arrays.sort(char1);		
		Arrays.sort(char2);		
		if (Arrays.equals(char1, char2)) 
			System.out.println("Given String Anagram "+str1 +" "+ str2);		
		}else {			
		System.out.println("Given String Not Anagram "+str1 +" "+ str2);	
		}				 
	}
}
