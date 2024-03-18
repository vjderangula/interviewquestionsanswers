package com.interviewquestionsanswers.strings;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class MostRepeatedWordJava8 {

	public static void main(String[] args) {

		
		List<String> listOfStrings= Arrays.asList("Java", "Spring", "Program", "Java", "String","Java","Spring","Dbms");
		
		
		Map<String, Long> map = listOfStrings.stream().collect(Collectors.groupingBy(str -> str,Collectors.counting()));
		
		Entry<String, Long> entry = map.entrySet().stream().max(Map.Entry.comparingByValue()).get();
		System.out.println("Repeated word '"+ entry.getKey()+ "' Times "+entry.getValue());
		
		
	}

}
