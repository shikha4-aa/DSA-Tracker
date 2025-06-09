class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        //same as the previous one
        return atMost(nums, k) - atMost(nums, k-1);
    }

        private int atMost(int[] nums, int k){
        int i = 0;
        int n=0;
        int count = 0;
        for(int j= i; j<nums.length; j++){
            if(nums[j]%2!=0){
                count++;
            }
        
            while(count>k){
               
                if(nums[i]%2!=0){
                count--;
                }
                i++;
            }

            n+= j-i+1;
        }
        return n;
        }
        
    
}

//Problem: https://leetcode.com/problems/number-of-subarrays-with-odd-sum/