// LeetCode Problem: https://leetcode.com/problems/subarray-product-less-than-k/
// Problem: Given an array of integers nums and an integer k, return the number of contiguous subarrays where the product of all the elements in the subarray is less than k.

class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int product = 1;
        int start = 0;
        int count = 0;

        if(k<=1){
            return 0;
        }

        for(int end =0; end<nums.length; end++){
            product*= nums[end];


            while(product>=k){
                product /= nums[start];
                start++;
                
            }
            count+= end- start + 1;
        }
        return count;
    }
}