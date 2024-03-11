package com.interviewquestionsanswers.functional;

public class AdditionalOperation {

	public static void main(String[] args) {

		
		int number1 = 10;
		int number2 = 20;
		
		 AdditionFunctionalInterface afi = ( numb1, numb2 ) -> numb1 + numb2;
			
			int result = afi.addition(number1, number2);
			System.out.println(result);
			
	}

}
