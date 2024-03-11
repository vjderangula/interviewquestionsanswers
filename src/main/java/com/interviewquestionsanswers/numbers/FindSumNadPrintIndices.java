package com.interviewquestionsanswers.numbers;

public class FindSumNadPrintIndices {

	public static void sumTarget(int[] numbers, int target) {

		for (int i = 0; i < numbers.length; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				if (numbers[i] + numbers[j] == target) {
					System.out.println(i + " " + j);
				}
			}
		}

	}

	public static void main(String[] args) {

		int[] numbers = { 1, 4, 2, 5 };
		int target = 9;
		sumTarget(numbers, target);
	}
}
