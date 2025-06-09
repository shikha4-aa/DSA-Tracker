//Problem: https://leetcode.com/problems/subarray-sum-equals-k/
class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {

        //the difference is exactly the number where sum==goal
        //however this only works when it's a non-negative array
        return atMost(nums, goal) - atMost(nums, goal-1 );
    }
        private int atMost(int[] nums, int k){
        int i = 0;
        int sum = 0;
        int count = 0;

        if(k<0){
            return 0;
        }
   
        for(int j= i; j<nums.length; j++){
            sum+= nums[j];
            
            while(sum>k){
                sum-=nums[i];
                i++;
            }
           count+= j-i+1;       
        }
        return count;
        }
    }
