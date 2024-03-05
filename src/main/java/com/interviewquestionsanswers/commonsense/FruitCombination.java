package com.interviewquestionsanswers.commonsense;

public class FruitCombination {
    public static void main(String[] args) {
        int budget = 100;
        int totalFruits = 100;
int count =1;
        for (int coconuts = 0; coconuts <= budget; coconuts++) {
            for (int mangoes = 0; mangoes <= budget; mangoes++) {
                for (int lemons = 0; lemons <= budget * 20; lemons++) {
                    if (coconuts + mangoes * 5 + lemons / 20 == budget && coconuts + mangoes + lemons == totalFruits) {
                        System.out.println("Total Combinations :: "+ count+" Coconuts: " + coconuts + ", Mangoes: " + mangoes + ", Lemons: " + lemons);
                    count++;
                    }
                }
            }
        }
    }
}
