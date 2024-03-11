package com.interviewquestionsanswers.numbers;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicatesPrinter {
    public static void main(String[] args) {
        int[] array = {2, 5, 8, 9, 4, 6, 3, 2, 5, 9, 7};
        
        printDuplicates(array);
    }
    
    public static void printDuplicates(int[] array) {
        Map<Integer, Long> countMap = Arrays.stream(array)
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println("Duplicates:");
        countMap.forEach((num, count) -> {
            if (count > 1) {
                System.out.println(num);
            }
        });
    }
}

