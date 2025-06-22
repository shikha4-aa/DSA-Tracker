// Leetcode Problem: https://leetcode.com/problems/minimum-size-subarray-sum/
// Problem Statement: Given an array of positive integers and a positive integer target, find the minimal length of a contiguous subarray of which the sum is at least target. If there is no such subarray, return 0 instead.

class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int start = 0;
        int sum = 0;
        int minlen= Integer.MAX_VALUE; //if it is set it to 0, which means even if you find a valid subarray, Math.min(0, something) will always be 0

        for(int end = 0; end<nums.length; end++){
            sum+= nums[end];
            while(sum >= target){
                minlen= Math.min(minlen, end- start+ 1);
                sum-= nums[start];
                start++;

            }  

        }

       return minlen== Integer.MAX_VALUE? 0: minlen; 
        
    }
}