package com.interviewquestionsanswers.numbers;

import java.util.Arrays;
import java.util.Iterator;

public class ArraySortEvenOddJava8 {
	
public static void main(String[] args) {
	

int[] input = {1,4,8,5,10,16,9,11,20};

int[] output = new int[input.length];

int index =0;
int lastIndex = input.length-1;


System.out.println("Input :: ");

Arrays.stream(input).forEach(i ->System.out.print(i+" "));

for (int i=0; i<input.length; i++) {

	if(input[i] % 2 != 0) {
		output[index++] = input[i];
	}else {
		output[lastIndex--] = input[i];
	}
}

System.out.println("\noutput :: ");
Arrays.stream(output).forEach(e->System.out.print(e+" "));
}

}
