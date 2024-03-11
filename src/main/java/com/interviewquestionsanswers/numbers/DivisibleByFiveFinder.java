package com.interviewquestionsanswers.numbers;

import java.util.Arrays;

public class DivisibleByFiveFinder {
    public static void main(String[] args) {
        int[] array = {8, 9, 5, 10, 20, 1, 25};
        
        findNumbersDivisibleByFive(array);
    }
    
    public static void findNumbersDivisibleByFive(int[] array) {
        System.out.println("Numbers divisible by 5:");
        Arrays.stream(array)
              .filter(num -> num % 5 == 0)
              .forEach(System.out::println);
    }
    
}

