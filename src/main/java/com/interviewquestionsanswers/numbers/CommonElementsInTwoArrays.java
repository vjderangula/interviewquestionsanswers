package com.interviewquestionsanswers.numbers;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CommonElementsInTwoArrays {
    public static void main(String[] args) {
        int[] array1 = {2, 5, 8, 9, 10};
        int[] array2 = {5, 9, 3, 4, 7};

        // Convert array1 to a set
        Set<Integer> set = new HashSet<>();
        Arrays.stream(array1).forEach(set::add);

        // Find common elements by filtering array2
        int[] commonElements = Arrays.stream(array2)
                .filter(set::contains)
                .toArray();

        // Print the common elements
        System.out.println(Arrays.toString(commonElements));
    }
}

