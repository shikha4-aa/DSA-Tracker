// Given an integer array nums that may contain duplicates, return all possible subsets (the power set).
//Link: https://leetcode.com/problems/subsets-with-dup/

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums); //essential to handle duplicates
        backtrack(nums, 0, result, new ArrayList<>());

        return result;
    }

    public void backtrack(int[] nums, int index, List<List<Integer>> result, ArrayList<Integer> current){
        result.add(new ArrayList<>(current));

        for(int i = index; i< nums.length; i++){
            if(i > index && nums[i] == nums[i-1]){
                continue;
            }
        
        current.add(nums[i]);
        backtrack(nums, i + 1, result, current);
        current.remove(current.size() - 1);
        }
    }
}