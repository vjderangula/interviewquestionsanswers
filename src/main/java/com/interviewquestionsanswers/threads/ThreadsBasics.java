package com.interviewquestionsanswers.threads;

class Task1 extends Thread {

	@Override
	public void run() {

		System.out.println("\nTask1 Started");
		for (int i = 191; i < 199; i++)
			System.out.print(" " + i);
		System.out.println("\nTask1 Done");
	}
}

public class ThreadsBasics {

	public static void main(String[] args) throws InterruptedException {

		/*
		 * 
		 * Task1 Started
		 * 
		 * Task2 Started 391 392 393 394 395 396 397 398 191 291 192 Task3 Done Main
		 * Method 193 292 194 195 196 197 198 293 Task1 Done 294 295 296 297 298 Task2
		 * Done
		 * 
		 * New Runnable Running Blocked/ waiting (Non-runnable state) Terminated/ Dead
		 */

		Task1 task1 = new Task1();
		task1.start();// task1.run();
		task1.setPriority(10);
		Task2 task2 = new Task2();
		Thread task2Thread = new Thread(task2);		
		task2Thread.start();// task2Thread.run();
		task1.join();
		task2Thread.join();
		
		Thread.sleep(1000);
		Thread.yield();
		//synchronized
		System.out.println("\nTask3 Started");
		for (int k = 391; k < 399; k++)
			System.out.print(" " + k);

		System.out.println("\nTask3 Done");
		System.out.println("Main Method");

	}

}

class Task2 implements Runnable {

	@Override
	public void run() {
		System.out.println("\nTask2 Started");
		for (int j = 291; j < 299; j++)
			System.out.print(" " + j);
		System.out.println("\nTask2 Done");
	}
}
