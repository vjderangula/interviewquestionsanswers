package com.interviewquestionsanswers.numbers;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PrimeNumbersIntegerArray {

	public static void main(String[] args) {
		int[] input = { 2, 6, 8, 18, 19, 15, 7, 11 };
		List<Integer> primeNumbers = Arrays.stream(input).boxed() // Convert int to Integer
				.filter(PrimeNumbers::isPrime).collect(Collectors.toList());

		System.out.println("Prime numbers in the input array: " + primeNumbers);
	}

	// Method to check if a number is prime
	public static boolean isPrime(int num) {
		return num > 1 && IntStream.range(2, (int) Math.sqrt(num) + 1)
				.noneMatch(i -> num % i == 0);
	}
}
