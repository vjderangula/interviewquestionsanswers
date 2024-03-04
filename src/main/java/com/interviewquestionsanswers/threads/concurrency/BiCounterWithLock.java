package com.interviewquestionsanswers.threads.concurrency;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BiCounterWithLock {


private int i=0;
private int j=0;

Lock lockForI = new ReentrantLock();
Lock lockForJ = new ReentrantLock();

 public void incrementI() {	
	lockForI.lock();
	i++;
	//get i
	//increment
	//set i
	lockForI.unlock();
}
public int getI() {
	return i;
}
 public void incrementJ() {	
	lockForJ.lock(); // Get lock for I
	j++;
	//get j
	//increment
	//set j
	lockForJ.unlock(); // Release lock for I
}
public int getJ() {
	return j;
}
}
