package com.interviewquestionsanswers.threads;

import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task extends Thread{
	
	private int number;
	public Task(int number) {
		this.number = number;
	}
public void run() {
	for (int i=number+10; i<number*10+99;i++) {
		System.out.print(i +" ");
		
	}
	System.out.println("\n Task " + number+ " done");
}
}
public class ExecutorServiceDemo {

	public static void main(String[] args) {

		//ExecutorService executorService = Executors.newSingleThreadExecutor();
		
		ExecutorService executorService = Executors.newFixedThreadPool(2);
		executorService.execute(new Task(1));
		executorService.execute(new Task(2));
		executorService.execute(new Task(3));
		executorService.execute(new Task(4));
		//executorService.execute(new Task1());
		//executorService.execute(new Thread(new Task2()));
		
		executorService.shutdown();
	}

}
