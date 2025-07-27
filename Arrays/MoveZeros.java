class Solution {
    public void moveZeroes(int[] nums) {
        int i= 0;
        for(int j= 0; j<nums.length; j++){
            if(nums[j]!= 0){
                nums[i]= nums[j];
                i++;
            }
        }

        while(i<nums.length){
            nums[i]= 0;
            i++;
        }
    }
}
//Link: https://leetcode.com/problems/move-zeroes/
//Problem: Given an integer array nums, move all 0's to the end of it
// while maintaining the relative order of the non-zero elements.
// Example: Input: [0,1,0,3,12] Output: [1,3,12,0,0]
// Explanation: The non-zero elements are 1, 3, and 12, which are moved to the front of the array,
// while the zeros are moved to the end, maintaining their relative order.
// Constraints: 1 <= nums.length <= 10^4
// 0 <= nums[i] <= 100