//Problem: Print numbers from 1 to N in increasing order using recursion.
//Link: https://practice.geeksforgeeks.org/problems/print-numbers-from-1-to-n-in-increasing-order-using-recursion/1

class Solution {
    static void printTillN(int N) {
        // code here
        if(N<= 0){
            return;
        }
      
        printTillN(N - 1);
        System.out.print(N +" ");
        
    }
}