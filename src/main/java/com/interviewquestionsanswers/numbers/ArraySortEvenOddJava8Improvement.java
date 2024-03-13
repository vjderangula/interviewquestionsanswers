package com.interviewquestionsanswers.numbers;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArraySortEvenOddJava8Improvement {
	
	public static void main(String[] args) {

	List<Integer> input =	Arrays.asList(1,4,8,5,10,16,9,11,20);
	
	System.out.println("Input ");
	input.forEach(e -> System.out.printf(e +" "));
	
	List<Integer> output =input.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
	
	input.stream().filter(n -> n % 2 != 0).collect(Collectors.toCollection(() -> output));
	
	System.out.println("\noutput ");
	output.forEach(e -> System.out.printf(e +" "));
	}

}
