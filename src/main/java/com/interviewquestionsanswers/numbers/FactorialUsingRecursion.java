package com.interviewquestionsanswers.numbers;

import java.util.stream.IntStream;

public class FactorialUsingRecursion {

	public static void main(String[] args) {		
		int num = 7;
		int factorialValue = factorial(num);
		if(factorialValue == 1) {
		System.out.println("The Factorial of "+ num+" is : "+ factorialValue);
	}else {
		System.out.println("The Factorial of "+ num+" is : "+ factorialValue);		
	}
		System.out.println("===========Streams===========");
		int number = 5;
		int integer = IntStream.rangeClosed(2, number).reduce(1, (x, y) -> x * y);
		System.out.println("The Factorial of "+ number+" is : "+ integer);		
	}
	private static int factorial(int num) {
		if(num == 1)
			return 1;
		return num*factorial(num-1);
	}
}
