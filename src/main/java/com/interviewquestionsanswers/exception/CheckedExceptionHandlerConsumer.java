package com.interviewquestionsanswers.exception;

public interface CheckedExceptionHandlerConsumer <Target, ExObj extends Exception>{
	
	public void accept(Target target) throws Exception;
	

}
