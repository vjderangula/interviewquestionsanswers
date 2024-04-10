package com.interviewquestionsanswers.strings;

import java.util.Arrays;
import java.util.Comparator;

public class StringPathSecondHighestNumber {

	public static void main(String[] args) {

		String path = "10-2-45-98-23-11";

		int shn = Arrays.stream(path.split("-")).mapToInt(Integer::parseInt).boxed().sorted(Comparator.reverseOrder())
				.skip(1).findFirst().get();
		System.out.println(shn);

	}

}
