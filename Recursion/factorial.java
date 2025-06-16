//Problem Link: https://practice.geeksforgeeks.org/problems/factorial3616/1

class Solution {
    static int factorial(int n) {
        // code here
        if(n<=0){
            return 1;
        }
        return n * factorial(n-1);
    }
}