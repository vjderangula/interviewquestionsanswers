package com.interviewquestionsanswers.numbers;

public class ArraySortEvenOdd {



public static void main(String[] args){


int[] input = {1,4,8,5,10,16,9,11,20};

int[] output = new int[input.length];

System.out.println("Input :: ");


for(int i=0; i<input.length;i++)
System.out.print(input[i] +" ");
int index =0;

for(int i=0; i<input.length;i++){
	if(input[i] %2 != 0){
		output[index++] = input[i];

	}
}
for(int i=0; i<input.length;i++){
	
if(input[i] %2 == 0){
		output[index++] = input[i];

	}
}

System.out.println("\noutput :: ");

for(int i=0; i<output.length;i++){
System.out.print(output[i]+" ");

}
}

}
/*
Input :: 
1 4 8 5 10 16 9 11 20 
output :: 
1 5 9 11 4 8 10 16 20
*/