package com.interviewquestionsanswers.strings;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringWithVowelsPrint {

	public static void main(String[] args) {

		
		
		
		List<String> list = Arrays.asList("Apple","Banana","Mango","Eagle","Ink","Umbrella");
		
		List<String> listVowels =list.stream().map(words -> words.toLowerCase())
		.filter(word -> word.charAt(0) == 'a' || word.charAt(0) == 'e' || word.charAt(0) == 'i' || word.charAt(0) == 'o' || word.charAt(0) == 'u')
		.collect(Collectors.toList());
		
		System.out.println(listVowels.toString());
	}

}
