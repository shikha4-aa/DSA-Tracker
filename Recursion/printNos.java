//Problem: Print numbers from N to 1 using recursion
//Link: https://practice.geeksforgeeks.org/problems/print-numbers-from-n-to-1-in-decreasing-order-using-recursion/1
class Solution {

    void printNos(int N) {
        // code here
        if(N<=0){
            return;
        }
        System.out.print(N +" ");
        printNos(N-1);
    }
}