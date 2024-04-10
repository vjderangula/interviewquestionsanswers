package com.interviewquestionsanswers.ytb;

import java.util.List;

public class StringWordOccurencesCount {

	public static void main(String[] args) {

		// find the word occurrence in a list of words
		// input: "apple", "banana", "orange", "Lemon", "apple", "kiwi", "apple"
		//output: "occurences of Apple are : 3
		List<String> listString = List.of("apple", "banana", "orange", "Lemon", "apple", "kiwi", "apple");
		
		Long result = listString.stream().filter(s-> s.equals("apple")).count();
		System.out.println("Occurences of Apple are : "+result);
	}

}
