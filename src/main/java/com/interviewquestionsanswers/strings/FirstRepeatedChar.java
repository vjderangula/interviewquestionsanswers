package com.interviewquestionsanswers.strings;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstRepeatedChar {

	public static void main(String[] args) {
		String strJava8 = "gbblegablrersty".replaceAll("\\s", "").toLowerCase();
		
		Map<String, Long> map = Arrays.stream(strJava8.split("")).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
		
		System.out.println(map.keySet());
String firstNonRepeatedChar = map.entrySet().stream().filter(entry -> entry.getValue() ==1).map(entry -> entry.getKey()).findFirst().get();

System.out.println(firstNonRepeatedChar);
	
	}

}
