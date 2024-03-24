package com.interviewquestionsanswers.ytb;

import java.util.Scanner;

public class PhoneNumberMasked {

	public static void main(String[] args) {

		
		System.out.print("Enter 10 Digit Phone Number :: ");
		
		Scanner sc = new Scanner(System.in);
		String phoneNumber = sc.next();
		
		if(phoneNumber.length()>=10) {
		String regixPhone = phoneNumber.replaceAll(".(?=.{2})", "#");
		String regixPhoneStar = phoneNumber.replaceAll(".(?=.{3})", "*");
		System.out.println("Masked Phone Number :: "+regixPhone);
		System.out.println("Masked Phone Number :: "+regixPhoneStar);
		}else {
			System.out.println("Phone Number Length not Suffient :: " + phoneNumber);
		}
		sc.close();
	}

}
/*
 * input ::  8888888821
 * output :: ########21
 * output :: *******421
 */
