package com.interviewquestionsanswers.threads.concurrency;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BiCounterWithLockWithAtomicInteger {


private AtomicInteger i = new AtomicInteger();
private AtomicInteger j = new AtomicInteger();

 public void incrementI() {	
	i.incrementAndGet();
	//get i
	//increment
	//set i
}
public int getI() {
	return i.get();
}
 public void incrementJ() {	
	j.incrementAndGet();
	//get j
	//increment
	//set j
}
public int getJ() {
	return j.get();
}
}
