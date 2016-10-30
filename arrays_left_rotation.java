// Problem: arrays left rotation operation

// if 2 left rotations are performed on array [1,2,3,4,5],
// then the array would become [3,4,5,1,2].

// give an array of n integers, and d left rotations on the array,
// print the updated array.

// constraints:
// 1<=n<=10^5
// 1<=d<=n
// 1<=a_i<=10^6

// input format:
// 1st line: number of element n in the array and value d.
// 2nd line: array

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static int[] arrayLeftRotation(int[] a, int n, int k) {
        
        // left rotation
        for(int i=0; i<k; i++){
            // left rotation by one
            int temp;
            for(int j=0; j<(n-1); j++){
                temp = a[j]; // store aj
                a[j] = a[j+1]; // update a(j+1) to aj
                a[j+1] = temp; // update stored value to a(j+1)
            }
        }
        return a;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); // number of elements n
        int k = in.nextInt(); // left rotation count
        int a[] = new int[n]; // array's space 
        for(int a_i=0; a_i< n; a_i++){ // a_i
            a[a_i] = in.nextInt();
        }
                
        int[] output = new int[n];
        output = arrayLeftRotation(a, n, k);
        for(int i = 0; i < n; i++)
            System.out.print(output[i] + " ");
      
        System.out.println();
      
    }
}



