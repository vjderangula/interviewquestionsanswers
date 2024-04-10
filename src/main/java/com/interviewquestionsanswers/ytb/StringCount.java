package com.interviewquestionsanswers.ytb;

import java.util.List;

public class StringCount {

	public static void main(String[] args) {

//Java 8 program to count strings whose length is greater than 3 in list
		// ("Java", "php", "python", "abc", "a", "you", "spring")
		List<String> stringList = List.of("Java", "php", "python", "abc", "a", "you", "spring");
	
		Long count = stringList.stream().filter(s -> s.length()>3).count();
		System.out.println(count);
	}

}
