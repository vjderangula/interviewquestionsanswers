package com.interviewquestionsanswers.devoxx;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.List;

public class StreamsIntegerEvenDoubleSum {

	public static void main(String[] args) {

		
		
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
	//	given the values , double the even numbers and total.
		System.out.println("===========Start for============");
		long start = System.currentTimeMillis();

		
		int result = 0;
		
		for (Integer integer : numbers) {
			if(integer % 2 == 0) {
				result += integer* 2;
			}
			
		}
		System.out.println(result);
		long end = System.currentTimeMillis();

		NumberFormat formatter = new DecimalFormat("#0.00000");
		System.out.println("Execution time is " + formatter.format((end - start) / 1000d) + " seconds");
		
		
		System.out.println("==========end=============");
		
		
		System.out.println("===========Start Stream============");
		long startStream = System.currentTimeMillis();
		System.out.println(numbers.stream()
			   .filter(n -> n% 2 == 0)
			   .map(n -> n*2)
			   .reduce(0, Integer::sum));
		long endStream = System.currentTimeMillis();

		NumberFormat formatter1 = new DecimalFormat("#0.00000");
		System.out.print("Execution time is " + formatter1.format((endStream - startStream) / 1000d) + " seconds");
		
		
		System.out.println("==========end=============");
		
		System.out.println(numbers.stream()
				   .filter(n -> n% 2 == 0)
				   .mapToInt(n -> n*2)
				   .sum());
		
	}

}
