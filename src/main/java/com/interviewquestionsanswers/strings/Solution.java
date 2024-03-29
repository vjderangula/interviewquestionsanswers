package com.interviewquestionsanswers.strings;

import java.io.IOException;

class Result {

    /*
     * Complete the 'repeatedString' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts following parameters:
     *  1. STRING s
     *  2. LONG_INTEGER n
     */

    public static long repeatedString(String s, long n) {
    
    long countOfA =0;
    
    for(int i=0;i<s.length();i++){
        
        if(s.charAt(i)=='a'){
            countOfA++;
        }
    }
    long repetitions = n/s.length();
    long remainingChars =n%s.length();
    
    for(int i=0; i<remainingChars;i++){
        
        if(s.charAt(i)=='a'){
            countOfA++;
        }
    }
    return countOfA * repetitions + countOfA;

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        //BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
       // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = "aba";//bufferedReader.readLine();

        long n = 10 ; //Long.parseLong(bufferedReader.readLine().trim());

        long result = Result.repeatedString(s, n);
System.out.println(result);
       // bufferedWriter.write(String.valueOf(result));
        //bufferedWriter.newLine();

        //bufferedReader.close();
        //bufferedWriter.close();
    }
}

