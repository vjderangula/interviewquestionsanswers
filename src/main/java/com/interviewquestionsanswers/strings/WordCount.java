package com.interviewquestionsanswers.strings;


import java.util.*;
public class WordCount{
	
	
	public static void main(String[] args){
		String str = "This is a Java Program for java a count of a program";
		String split =str.toLowerCase().replaceAll("\\s", "");
			HashMap<Character, Integer> cCount = new HashMap<Character, Integer>();			
			for (int j=0; j<split.length();j++) {				
				Character ch = split.charAt(j);
				if(cCount.containsKey(ch)) {
					int count = cCount.get(ch);					
					count++;
					cCount.replace(ch, count);
			 }else {
				 cCount.put(ch, 1);
			 }				
		   }
			for (Character chr : cCount.keySet()) {
				System.out.println(chr +" :: "+cCount.get(chr));				
			}	
	}
}

