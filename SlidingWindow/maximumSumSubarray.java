//Problem: https://practice.geeksforgeeks.org/problems/maximum-sum-subarray-of-size-k5313/1
//Problem Statement: Given an array of integers Arr of size N and an integer K. Return the maximum sum of a subarray of size K.

class Solution {
    public int maximumSumSubarray(int[] arr, int k) {
        // Code here
        int start = 0;
        int sum = 0;
        int max= 0;
        for(int end = 0; end<arr.length; end++){
            sum+= arr[end];
            
            if(end-start+1 == k){
                max= Math.max(max, sum);
            }
            
            if(end - start + 1 > k){
                sum-= arr[start];
                start++;
                max= Math.max(max, sum);
            }
        }
        return max;
    }
}