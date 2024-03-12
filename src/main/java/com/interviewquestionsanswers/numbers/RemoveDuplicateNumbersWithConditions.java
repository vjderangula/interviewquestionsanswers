package com.interviewquestionsanswers.numbers;

/*
 * 
 * Given a sorted array, the task is to remove the duplicate 
 * elements from the array.
Don't use the inbuilt method and collection.
Use 1 for loop
Examples
Input  : arr[] = {1, 2, 2, 3, 4, 4, 4, 5, 5} 
Output : arr[] = {1, 2, 3, 4, 5}
 * 
To remove duplicate elements from a sorted array using only one for loop, 
you can maintain two pointers: one for iterating through the array and 
another for keeping track of the current position to insert the next unique 
element. Here's how you can implement this in Java:

 * 
 * 
 */
public class RemoveDuplicateNumbersWithConditions {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 2, 3, 4, 4, 4, 5, 5 };

		int n = removeDuplicates(arr);

		// Print the array after removing duplicates
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static int removeDuplicates(int[] arr) {
		int n = arr.length;

		// Edge case: If array length is 0 or 1, no duplicates to remove
		if (n <= 1) {
			return n;
		}

		// Initialize the index to store the next unique element
		int index = 0;

		// Iterate through the array starting from the second element
		for (int i = 1; i < n; i++) {
			// If the current element is different from the previous element,
			// store it in the next position in the array
			if (arr[i] != arr[index]) {
				arr[++index] = arr[i];
			}
		}

		// Return the length of the array with duplicates removed
		return index + 1;
	}
}

/*
 * In this program:
 * 
 * We define a method removeDuplicates that takes an array of integers as input
 * and returns the length of the array after removing duplicates. We initialize
 * a variable index to keep track of the current position to insert the next
 * unique element. We iterate through the array starting from the second element
 * (index 1). For each element, if it is different from the previous element, we
 * store it in the next position in the array (incrementing index by 1). This
 * effectively removes duplicates. Finally, we return the length of the array
 * with duplicates removed, which is equal to index + 1.
 * 
 * 
 */
