package com.interviewquestionsanswers;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Roughf {

	public static void main(String[] args) {

		
	        LocalDateTime now = LocalDateTime.now();  
	        System.out.println("Before Formatting: " + now);  
	        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");  
	        String formatDateTime = now.format(format);   
	        System.out.println("After Formatting: " + formatDateTime);  
	}

}
