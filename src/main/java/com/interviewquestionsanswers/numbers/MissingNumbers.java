package com.interviewquestionsanswers.numbers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
 * 
 * To find the missing numbers in a given array of integers, you can create a list containing all integers in the expected range and then use Java 8 streams to filter out the integers that are present in the input array. Here's how you can do it:
 */
public class MissingNumbers {
	public static void main(String[] args) {
		int[] input = { 1, 4, 2, 5, 8};
		int[] missingNumbers = findMissingNumbers(input);

		System.out.println("Missing numbers: " + Arrays.toString(missingNumbers));
	}

	public static int[] findMissingNumbers(int[] input) {
		// Find the maximum and minimum numbers in the input array
		int min = Arrays.stream(input).min().orElse(0);
		int max = Arrays.stream(input).max().orElse(0);

		// Create a list containing all integers in the expected range
		List<Integer> expectedNumbers = new ArrayList<>();
		for (int i = min; i <= max; i++) {
			expectedNumbers.add(i);
		}

		// Use Java 8 streams to filter out the integers that are present in the input
		// array
		List<Integer> missingNumbersList = expectedNumbers.stream()
				.filter(num -> !Arrays.stream(input).anyMatch(i -> i == num)).collect(Collectors.toList());

		// Convert the list of missing numbers to an array
		int[] missingNumbers = new int[missingNumbersList.size()];
		for (int i = 0; i < missingNumbersList.size(); i++) {
			missingNumbers[i] = missingNumbersList.get(i);
		}

		return missingNumbers;
	}
}
/*
 * In this program:
 * 
 * We find the minimum and maximum numbers in the input array using Java 8
 * streams. We create a list containing all integers in the expected range from
 * the minimum to the maximum number. We use Java 8 streams to filter out the
 * integers that are present in the input array and collect the missing numbers
 * into a list. Finally, we convert the list of missing numbers to an array and
 * return it.
 * 
 */
