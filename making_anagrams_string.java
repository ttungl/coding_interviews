// making anagrams string


// Alice is taking a cryptography class and finding anagrams to be very useful. We consider two strings to be anagrams of each other if the first string's letters can be rearranged to form the second string. In other words, both strings must contain the same exact letters in the same exact frequency For example, bacdc and dcbac are anagrams, but bacdc and dcbad are not.

// Alice decides on an encryption scheme involving two large strings where encryption is dependent on the minimum number of character deletions required to make the two strings anagrams. Can you help her find this number?

// Given two strings, a and b, that may or may not be of the same length, determine the minimum number of character deletions required to make  and  anagrams. Any characters can be deleted from either of the strings.

// Input Format

// The first line contains a single string, a. 
// The second line contains a single string, b.

// Constraints

// It is guaranteed that  and  consist of lowercase English alphabetic letters (i.e.,  through ).
// Output Format

// Print a single integer denoting the number of characters you must delete to make the two strings anagrams of each other.

// Sample Input
// cde
// abc

// Sample Output
// 4

// Explanation

// We delete the following characters from our two strings to turn them into anagrams of each other:

// Remove d and e from cde to get c.
// Remove a and b from abc to get c.
// We must delete 4 characters to make both strings anagrams, so we print  on a new line.

// --

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Solution {
    public static int numberNeeded(String first, String second) {
        int result=0;
        String str1 = first; // strings do not need to have the same lengths.
        String str2 = second;
        int numOfAlphabet = 26;
        int [] array1 = new int[numOfAlphabet];
        int [] array2 = new int[numOfAlphabet];
        
        for(int i=0; i<str1.length(); i++){
            char ch = str1.charAt(i); // element
            array1[ch-'a']++;
        }
        
        for(int i=0; i<str2.length(); i++){
            char ch = str2.charAt(i); // element
            array2[ch-'a']++;
        }
        
        for (int i=0; i<numOfAlphabet; i++){
            result += Math.abs(array1[i]-array2[i]);
        }        
        return result*2;
    }
  
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        System.out.println(numberNeeded(a, b));
    }
}



