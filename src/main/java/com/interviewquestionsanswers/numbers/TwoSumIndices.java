package com.interviewquestionsanswers.numbers;

import java.util.HashMap;
import java.util.Map;

/*
 * 
 * To find the sum of two integers equal to a target integer and print their indices using Java 8, you can use a HashMap to store the elements of the array along with their indices. Then, iterate through the array, and for each element, check if the complement (target - current element) exists in the HashMap. If it does, print the indices of the two elements. Here's how you can do it:
 */
public class TwoSumIndices {
	public static void main(String[] args) {
		int[] nums = { 1, 4, 2, 5 };
		int target = 9;

		findTwoSumIndices(nums, target);
	}

	public static void findTwoSumIndices(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < nums.length; i++) {
			int complement = target - nums[i];

			if (map.containsKey(complement)) {
				System.out.println("Indices: [" + map.get(complement) + ", " + i + "]");
				return;
			}

			map.put(nums[i], i);
		}

		System.out.println("No two elements sum up to the target.");
	}
}

/*
 * 
 * In this program:
 * 
 * We initialize a HashMap to store the elements of the array along with their
 * indices. We iterate through the array and for each element, calculate its
 * complement (target - current element). If the complement exists in the
 * HashMap, it means we have found two elements whose sum is equal to the
 * target. We print their indices. If no such pair is found, we print a message
 * indicating that no two elements sum up to the target.
 */
