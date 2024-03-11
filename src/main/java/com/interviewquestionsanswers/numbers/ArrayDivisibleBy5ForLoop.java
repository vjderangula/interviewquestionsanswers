package com.interviewquestionsanswers.numbers;

import java.util.ArrayList;
import java.util.List;

public class ArrayDivisibleBy5ForLoop {

	public static void main(String[] args) {

		int[] intput = { 8, 9, 5, 10, 20, 1, 5, 25 };
		System.out.println(PrintNumbersDivisibleBy5(intput));

	}

	public static List<Integer> PrintNumbersDivisibleBy5(int[] input) {
		List<Integer> result = new ArrayList<Integer>();
		for (int i = 0; i < input.length; i++) {
			if (input[i] % 5 == 0)
				result.add(input[i]);
		}
		return result;
	}

}
