// Link: https://www.geeksforgeeks.org/check-if-there-is-a-subsequence-with-given-sum/
// LeetCode Problem: https://leetcode.com/problems/subsequence-sum/
class Solution {
    public static boolean checkSubsequenceSum(int N, int[] arr, int K) {
        // code here
       return solve(0, arr, K, N);
    }
    
    public static boolean solve(int index, int[] arr, int K, int N){
         if(K == 0){
            return true;
        }
        
        if(index == N){
            return false;
        }
        
       
        
        if(arr[index] <= K){
            if(solve(index + 1, arr, K - arr[index], N)){
            return true;
            }
        }
        
       if(solve(index+ 1, arr, K, N)){
           return true;
       }   
       return false;
    }
}
