package com.interviewquestionsanswers.numbers;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SecondHighestNumber {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(3,6,9,4,2,16,10,12);
		
		Integer secondHighest = findSecondHighest(numbers);
		
		if(secondHighest != null) {
			System.out.println("Second Highest Element : "+ secondHighest);
		}else {
			System.out.println("No Second Highest Element Found");
		}
	}

	private static Integer findSecondHighest(List<Integer> numbers) {

		if(numbers == null || numbers.size() < 2) {
			return null;
		}
		Collections.sort(numbers, Comparator.reverseOrder());
		
		return numbers.get(1);
	}

}
