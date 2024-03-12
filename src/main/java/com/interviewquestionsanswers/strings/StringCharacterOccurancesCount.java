package com.interviewquestionsanswers.strings;

import java.util.HashMap;
import java.util.Iterator;

public class StringCharacterOccurancesCount {

	public static void main(String[] args) {

/**Write a Java Program 
 * input="aaabbbhhccc"
 * output= "a3b3c3h2"
 */		String str = "aaabbbhhccc";		
		HashMap<Character, Integer> cCount = new HashMap<Character, Integer>();		
		for (int i=0; i<str.length();i++) {			
			Character ch = str.charAt(i);
			if(cCount.containsKey(ch)) {
				int count = cCount.get(ch);				
				count++;
				cCount.replace(ch, count);
		 }else {
			 cCount.put(ch, 1);
		 }			
	   }
		for (Character chr : cCount.keySet()) {
			System.out.print(chr +""+cCount.get(chr));			
		}
	}

}
