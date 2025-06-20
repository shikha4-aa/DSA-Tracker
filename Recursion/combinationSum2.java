//Link: https://leetcode.com/problems/combination-sum-ii/
//Problem: Given a collection of candidate numbers (candidates) and a target number (target), find all unique combinations in candidates where the candidate numbers sum to target. Each number in candidates may only be used once in the combination. Note: The solution set must not contain duplicate combinations.

import java.util.*;
class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates); // important to handle duplicates
        backtrack(0, candidates, new ArrayList<>(), result, target);
        return result;
    }

    private void backtrack(int start, int[] candidates, List<Integer> current, List<List<Integer>> result, int target) {
        if (target == 0) {
            result.add(new ArrayList<>(current));
            return;
        }

        for (int i = start; i < candidates.length; i++) {
            // skip duplicates
            if (i > start && candidates[i] == candidates[i - 1]) continue;

            if (candidates[i] > target) break;

            current.add(candidates[i]);
            backtrack(i + 1, candidates, current, result, target - candidates[i]);
            current.remove(current.size() - 1); // backtrack
        }
    }
}
