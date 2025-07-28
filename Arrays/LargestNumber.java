// Given an integer array nums, return the largest element in the array.

class Solution {
    public int largestElement(int[] nums) {
             int large = nums[0];
           for(int i=1; i<nums.length; i++){
            if(large< nums[i]){
                large= nums[i];
            }

           }
           return large;
    }
}