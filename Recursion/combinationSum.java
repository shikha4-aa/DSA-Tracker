// LeetCode Problem: https://leetcode.com/problems/combination-sum/
// Problem: Given an array of distinct integers candidates and a target integer target, return a list of all unique combinations of candidates where the chosen numbers sum to target. You may return the combinations in any order.

import java.util.*;
class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> current = new ArrayList<>();;
         List<List<Integer>> result= new ArrayList<>();
        int sum = 0;
        backtrack(0, candidates, current, result, target, sum);
        return result;
    }


    public void backtrack(int index, int[] candidates, List<Integer> current, List<List<Integer>> result, int target, int sum){
        if(sum == target){
            result.add(new ArrayList<>(current));
            return;
        }

        if(sum> target || index>= candidates.length){
            return;
        }

        current.add(candidates[index]);
        backtrack(index, candidates, current, result, target, sum+ candidates[index]);
        current.remove(current.size() -1);
        backtrack(index + 1, candidates, current, result, target, sum);
    }
}