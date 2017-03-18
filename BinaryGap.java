// you can also use imports, for example:
// import java.util.*;
import java.util.ArrayList;
import java.util.Collections;
// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int N) {
        // write your code in Java SE 8
        int counter = 0;
        int count=0; // for arrayct
        int flag1=0;
        ArrayList<Integer> mylist = new ArrayList<Integer>();
        
        // convert int to bin
        String binaryStr = Integer.toBinaryString(N);
        
        // System.out.println(""+binaryStr);
        
        for (int i=0; i<binaryStr.length(); i++){
            if (binaryStr.substring(i, i+1).equals("1")){
                
                if (flag1 == 0){
                    flag1 = 1;
                } else { // next "1"
                    mylist.add(counter);
                    counter = 0; //reset
                }
            } else {
                if (flag1 == 1){
                    counter += 1;
                } 
            }
        }
        // Sort in descending order of mylist
        Collections.sort(mylist, Collections.reverseOrder());
        return mylist.get(0);
    }
}