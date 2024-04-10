package com.interviewquestionsanswers.ytb;

import java.util.Arrays;

public class SumOfEvenNumbersInArray {

	public static void main(String[] args) {

		//write a java program to sum the even numbers in an integer array
		//input: {1,2,3,4,5,6,7,8,9,10} output: 30
		
		int[] array = {1,2,3,4,5,6,7,8,9,10};
		
		int result = Arrays.stream(array).filter(n -> n%2 ==0).sum();
		System.out.println(result);
		
		
	}

}
