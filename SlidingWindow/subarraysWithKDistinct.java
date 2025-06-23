// LeetCode Problem: https://leetcode.com/problems/subarrays-with-k-different-integers/
// Problem: Given an array of integers nums and an integer k, return the number of subarrays that contain exactly k distinct integers.

import java.util.HashMap;
class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return atMost(nums, k) - atMost(nums, k-1);
    }

    private int atMost(int[] nums, int k){
        HashMap<Integer,Integer> mp = new HashMap<>();
        int start = 0;
        int count = 0;
        int res= 0;

        for(int end = 0; end< nums.length; end++){
              mp.put(nums[end], mp.getOrDefault(nums[end], 0) + 1);
              if(mp.get(nums[end])== 1){
                count++;
              }

              while(count > k){
                mp.put(nums[start], mp.get(nums[start]) - 1);
                if(mp.get(nums[start]) == 0){
                    mp.remove(nums[start]);
                    count--;
                }
                start++;
              }
              res+= end - start + 1;
        }
        return res;
    }
}