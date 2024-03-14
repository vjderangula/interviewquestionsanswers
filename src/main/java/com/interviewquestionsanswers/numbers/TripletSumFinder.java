package com.interviewquestionsanswers.numbers;

import java.util.*;

public class TripletSumFinder {
    public static void main(String[] args) {
        int[] arr = {1, 4, 6, 10, 8};
        int targetSum = 13;
        
        List<List<Integer>> triplets = findTriplets(arr, targetSum);
        
        if (triplets.isEmpty()) {
            System.out.println("No triplet found with sum " + targetSum);
        } else {
            System.out.println("Triplets with sum " + targetSum + ": " + triplets);
        }
    }
    
    public static List<List<Integer>> findTriplets(int[] arr, int targetSum) {
        List<List<Integer>> triplets = new ArrayList<>();
        
        Arrays.sort(arr); // Sort the array
        
        for (int i = 0; i < arr.length - 2; i++) {
            int left = i + 1;
            int right = arr.length - 1;
            
            while (left < right) {
                int currentSum = arr[i] + arr[left] + arr[right];
                
                if (currentSum == targetSum) {
                    List<Integer> triplet = new ArrayList<>();
                    triplet.add(arr[i]);
                    triplet.add(arr[left]);
                    triplet.add(arr[right]);
                    triplets.add(triplet);
                    
                    // Move left pointer to the right to find next triplet
                    left++;
                    // Move right pointer to the left to find next triplet
                    right--;
                } else if (currentSum < targetSum) {
                    // If current sum is less than target, move left pointer to the right
                    left++;
                } else {
                    // If current sum is greater than target, move right pointer to the left
                    right--;
                }
            }
        }
        
        return triplets;
    }
}

