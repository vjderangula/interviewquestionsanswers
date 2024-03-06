package com.interviewquestionsanswers.commonsense;
/*
 * 
 * To include 100 fruits within the budget of 100 rupees, we need to find a combination of fruits where the total cost does not exceed 100 rupees. We also need to consider the maximum number of fruits we can purchase within the given budget.

Let's analyze the cost and number of fruits per rupee for each fruit:

Coconut: 1 rupee per coconut
Mango: 5 rupees per mango
Lemon: 1 rupee for 20 lemons (which means 1 lemon costs 1/20 rupees)
Based on this information, we need to find a combination of coconuts, mangoes, and lemons such that the total cost is 100 rupees and the total number of fruits is 100.

Here's one possible solution:

Let's say we buy x coconuts, y mangoes, and z lemons.
The total cost equation would be: x + 5y + (z/20) = 100
Additionally, the total number of fruits equation would be: x + y + z = 100
We can solve these equations to find the values of x, y, and z. However, since there are multiple solutions to these equations, we can iterate through possible combinations within the given budget constraints.

Here's a sample Java code to find all possible combinations of coconuts, mangoes, and lemons within the budget of 100 rupees:
 This code iterates through all possible combinations of coconuts, mangoes, and lemons and checks if the total cost equals 100 rupees and the total number of fruits equals 100. It then prints out all valid combinations. You can run this code to find different combinations of fruits that fit the given criteria.
 *
 *
 *
 */
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
