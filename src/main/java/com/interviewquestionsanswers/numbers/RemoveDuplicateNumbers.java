package com.interviewquestionsanswers.numbers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicateNumbers {

	public static void main(String[] args) {
		
		
		/**Write a Java Program to print duplicate numbers
		 * input=2,5,8,9,4,6,3,2,5,9,7
		 * output= [2, 5, 9]
		 */
		List<Integer> withDuplicates = new ArrayList<Integer>();
		withDuplicates.add(2);
		withDuplicates.add(5);
		withDuplicates.add(6);
		withDuplicates.add(9);
		withDuplicates.add(6);
		withDuplicates.add(9);
		withDuplicates.add(15);
		withDuplicates.add(5);
		withDuplicates.add(8);
		withDuplicates.add(15);
		
		Set<Integer> withoutduplicates = new LinkedHashSet<Integer>(withDuplicates);
		
		List<Integer> withoutDuplicates = new ArrayList<Integer>(withoutduplicates);
		
		System.out.println(withoutDuplicates);
		
		
		System.out.println("==================Streams==================");
		
		/**Write a Java 8 Program to print unique numbers
		 * input=2,5,4,6,9,8,7,2,4,6,3,5,8,9
		 * output= 2, 5, 4, 6, 9, 8, 7, 3
		 */
		List<Integer> withDuplicatesStreams = Arrays.asList(2,5,4,6,9,8,7,2,4,6,3,5,8,9);
	
		List<Integer> withoutDuplicatesStreams =  withDuplicatesStreams.stream()
				.distinct().collect(Collectors.toList());
		
		System.out.println(withoutDuplicatesStreams);
		
		
		
		
		
		
	}

}
