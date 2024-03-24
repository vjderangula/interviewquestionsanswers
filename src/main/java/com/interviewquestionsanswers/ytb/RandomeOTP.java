package com.interviewquestionsanswers.ytb;

public class RandomeOTP {

	public static void main(String[] args) {

		
		int randomeOtp = (int) (Math.random()*9000)+1000;
		
		System.out.println("OTP : "+ randomeOtp);
	}

}
