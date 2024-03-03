package com.interviewquestionsanswers.numbers;

import java.util.HashSet;
import java.util.Set;

public class NumbersPrintDuplicates {

	public static void main(String[] args) {

		
		int[] arrays = {2,5,8,9,4,6,3,2,5,9,7};
		
		
	Set<Integer> uset = new HashSet<>();
	Set<Integer> dset = new HashSet<>();

	for (Integer integer : arrays) {
		if(!uset.add(integer)) {
			dset.add(integer);
		}		
	}
	System.out.println(dset.toString());
	}

}
