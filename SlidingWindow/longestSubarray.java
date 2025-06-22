//Link: https://leetcode.com/problems/longest-subarray-of-1s-after-deleting-one-element/
////Problem: Given a binary array nums, you should delete one element from it. Return the size of the longest non-empty subarray containing only 1's in the resulting array. Return 0 if there is no such subarray.
/// 
class Solution {
    public int longestSubarray(int[] nums) {
        int start = 0;
        int max = 0;
        int count = 0;
        

        for(int end = 0; end<nums.length; end++){

            if(nums[end]==0){
                count++;
                
            }

            while(count > 1){
               if(nums[start]==0){
                count--;
               }
               
               start++;
            }

            max= Math.max(max, end - start);
        }
        return max;
    }
}