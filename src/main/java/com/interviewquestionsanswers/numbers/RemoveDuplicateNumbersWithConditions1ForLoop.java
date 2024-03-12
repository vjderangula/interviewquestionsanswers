package com.interviewquestionsanswers.numbers;

public class RemoveDuplicateNumbersWithConditions1ForLoop {
		public static void main(String[] args) {
			int[] arr = { 1, 2, 2, 3, 4, 4, 4, 5, 5 };
			int n = removeDuplicates(arr);		
			for (int i = 0; i < n; i++) {
				System.out.print(arr[i] + " ");
			}
		}
		public static int removeDuplicates(int[] arr) {
			int n = arr.length;
			if (n <= 1) {
				return n;
			}
			int index = 0;
			for (int i = 1; i < n; i++) {
				if (arr[i] != arr[index]) {
					arr[++index] = arr[i];
				}
			}
			return index + 1;
		}
	}

