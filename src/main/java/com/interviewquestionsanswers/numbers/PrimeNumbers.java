package com.interviewquestionsanswers.numbers;

import java.util.stream.IntStream;

public class PrimeNumbers {
    public static void main(String[] args) {
        System.out.println("Prime numbers between 1 and 20:");
        IntStream.rangeClosed(2, 20)
                .filter(PrimeNumbers::isPrime)
                .forEach(System.out::println);
    }

    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        return num > 1 && IntStream.range(2, num)
                .noneMatch(i -> num % i == 0);
    }
}

