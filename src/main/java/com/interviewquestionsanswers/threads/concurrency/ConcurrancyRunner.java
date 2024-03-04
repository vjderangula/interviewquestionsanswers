package com.interviewquestionsanswers.threads.concurrency;

public class ConcurrancyRunner {

	public static void main(String[] args) {

		BiCounterWithLockWithAtomicInteger bai = new BiCounterWithLockWithAtomicInteger();
		bai.incrementI();
		bai.incrementJ();
		bai.incrementI();
		bai.incrementJ();
		bai.incrementI();
		bai.incrementJ();
		
		System.out.println(bai.getI());		
		System.out.println(bai.getJ());
		/*Counter counter= new Counter();
		counter.increment();
		counter.increment();
		counter.increment();
		
		System.out.println(counter.getI());
		*/
	}

}
