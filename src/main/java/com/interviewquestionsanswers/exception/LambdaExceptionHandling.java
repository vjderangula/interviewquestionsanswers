package com.interviewquestionsanswers.exception;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class LambdaExceptionHandling {

	public static void main(String[] args) {

	/*	//Approach --1
		List<Integer> integerList = Arrays.asList(2,5,7,9,10,40,50);
		integerList.forEach(i -> {
			try {
				System.out.println(50/i);
			} catch (ArithmeticException e) {
				System.err.println(
				          "Arithmetic Exception occured : " + e.getMessage());
			}
			
		});*/
		
		//Approach --2
		List<Integer> integerList1 = Arrays.asList(2,5,7,9,10,40,50);
		
		integerList1.forEach(null);
	}
	static Consumer<Integer> lambdaWrapper(Consumer<Integer> consumer){
		
		return i -> {
			try {
				consumer.accept(i);
			} catch (ArithmeticException e) {
				System.out.println("ArithmeticException Occured :: "+e.getMessage());
			}
		};
	
	}

}
