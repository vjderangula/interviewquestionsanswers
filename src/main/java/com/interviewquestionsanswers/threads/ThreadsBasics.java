package com.interviewquestionsanswers.threads;


class Task1 extends Thread {
	
	@Override
	public void run() {
		
	System.out.println("\nTask1 Started");
	for (int i = 191; i < 199; i++) 
		System.out.print(" "+i);
	System.out.println("\nTask1 Done");
	}
}
public class ThreadsBasics {

	public static void main(String[] args) {

		Task1 task1 = new Task1();
		task1.start();//task1.run();
		
		Task2 task2 = new Task2();
		Thread task2Thread = new Thread(task2);
		
		task2Thread.start();//task2Thread.run();
		for (int k = 391; k < 399; k++) 
			System.out.print(" "+k);
			
		System.out.println("\nTask3 Done");
		System.out.println("Main Method");
	
	}

}
class Task2 implements Runnable{
	
	@Override
	public void run() {
		System.out.println("\nTask2 Started");
		for (int j = 291; j < 299; j++) 
			System.out.print(" "+j);
		System.out.println("\nTask2 Done");
	}
}
