package com.interviewquestionsanswers.exception;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class StreamException {

	public static void main(String[] args) {

		
		List<String> listString = Arrays.asList("44","55","xyz");
		
		List<Integer> listInteger = Arrays.asList(1,4,0);
		listInteger.forEach(handleGenericException(s -> System.out.println(10/s),ArithmeticException.class));
		
		listString.forEach(handleGenericException(s->System.out.println(Integer.parseInt(s)), NumberFormatException.class));
	}

	public static <Target, ExObj extends Exception> Consumer<Target> handleGenericException(
			Consumer<Target> targetcoConsumer, Class<ExObj> exObjClass) {
		return obj -> {
			try {
				targetcoConsumer.accept(obj);
			} catch (Exception e) {
				try {
					ExObj exc = exObjClass.cast(e);
					System.out.println("Exception :" + exc.getMessage());
				} catch (Exception e2) {
					throw e;
				}

			}

		};
	}
}
