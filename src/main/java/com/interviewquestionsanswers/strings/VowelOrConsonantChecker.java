package com.interviewquestionsanswers.strings;

import java.util.Scanner;

public class VowelOrConsonantChecker {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println(" Enter a Single Alphabet : ");
		char alphabet = sc.next().charAt(0);
 
		boolean isVowel = false;

		if (alphabet == 'a' || alphabet == 'A' || alphabet == 'e' || alphabet == 'E' || alphabet == 'i'
				|| alphabet == 'I' || alphabet == 'o' || alphabet == 'O' || alphabet == 'u' || alphabet == 'U') {
			isVowel = true;
		}

		if (isVowel) {
			System.out.println(alphabet + " is Vowel");
		} else {
			System.out.println(alphabet + " is Consonant");
		}
		sc.close();
	}

}
