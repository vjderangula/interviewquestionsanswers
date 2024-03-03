package com.interviewquestionsanswers.threads;

public class ThreadsBasics {

	public static void main(String[] args) {


		for (int i = 191; i < 199; i++) 
			System.out.print(" "+i);
		System.out.println("\nTask1 Done");
		
		for (int j = 291; j < 299; j++) 
			System.out.print(" "+j);
		System.out.println("\nTask2 Done");
		for (int k = 391; k < 399; k++) 
			System.out.print(" "+k);
			
		System.out.println("\nTask3 Done");
		System.out.println("Main Method");
	
	}

}
