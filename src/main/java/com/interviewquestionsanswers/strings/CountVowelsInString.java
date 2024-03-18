package com.interviewquestionsanswers.strings;

import java.io.IOException;
import java.util.ArrayList;

public class CountVowelsInString {
	/*
	  static int isVowel(char chars)
    {
        if (chars == 'a' || chars == 'e' || chars == 'i'
            || chars == 'o' || chars == 'u') {
            return 1;
        }
        else {
            return 0;
        }
    }
 
    // recursive function to return the number
    // of characters in a string
    static int vowelno(String str, int l)
    {
        if (l == 1) {
            return isVowel(str.charAt(l - 1));
        }
 
        return vowelno(str, l - 1)
            + isVowel(str.charAt(l - 1));
    }
 
    public static void main(String[] args)
        throws IOException
    {
        String str = "BufferedOutput";
 
        str = str.toLowerCase();
 
        System.out.println(
            "Total number of vowels in string are:");
 
        System.out.println(vowelno(str, str.length()));
    }
    //===========================================================
	public static void main(String[] args)
	        throws IOException
	    {
	        String str = "GeeksForGeeks";
	        str = str.toLowerCase();
	        int count = 0;
	 
	        for (int i = 0; i < str.length(); i++) {
	            // check if char[i] is vowel
	            if (str.charAt(i) == 'a' || str.charAt(i) == 'e'
	                || str.charAt(i) == 'i'
	                || str.charAt(i) == 'o'
	                || str.charAt(i) == 'u') {
	                // count increments if there is vowel in
	                // char[i]
	                count++;
	            }
	        }
	 
	        // display total count of vowels in string
	        System.out.println(
	            "Total no of vowels in string are: " + count);
	    }
	//############################################################
    public static void main(String[] args)throws IOException
    {
        String str = "GeeksForGeeks";
        str = str.toLowerCase();
        int count = 0;
        String vow ="aeiou";
        ArrayList<Character> vowels = new ArrayList<Character>();
        for(int i=0;i<vow.length();i++)
        {
            vowels.add(vow.charAt(i));
        }
        for (int i = 0; i < str.length(); i++) {
            if(vowels.contains(str.charAt(i))){
                count++;
            }
        }
 
        // display total count of vowels in string
        System.out.println("Total no of vowels in string are: " + count);
    }
    */
    static int isVowel(char ch) {
        ch = Character.toUpperCase(ch);
        if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
            return 1;
        else
            return 0;
    }
    // to count total number of vowel from 0 to n
    static int countVowels(String str, int n) {
        if (n == 1) return isVowel(str.charAt(n - 1));
        return countVowels(str, n - 1) + isVowel(str.charAt(n - 1));
    }
    // Main Calling Function
    public static void main(String args[]) {
        // string object
        String str = "worldofcommerce";

    // Total numbers of Vowel
    System.out.print("Total number of Vowel = ");
    System.out.println(countVowels(str, str.length()));
  }
}
