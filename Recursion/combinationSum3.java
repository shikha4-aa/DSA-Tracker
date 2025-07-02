
//Link: https://leetcode.com/problems/combination-sum-iii/
// Given two integers k and n, return all possible combinations of k numbers chosen from the range [1, 9] such that the sum of the chosen numbers is n.

import java.util.List;
import java.util.ArrayList;
class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(k, n, result, new ArrayList<>(), 0, 1);
        return result;
    }


    public void backtrack(int k, int n, List<List<Integer>> result, List<Integer> current, int sum, int index){

        if(sum > n || current.size() > k){
            return;
        }
        if(current.size() == k && sum == n){
            result.add(new ArrayList<>(current));
            return;
        }

        for(int i = index; i<=9; i++){
            if(i > n){
                break;
            }

            current.add(i);
            backtrack(k, n, result, current, sum + i, i+ 1);

            current.remove(current.size() - 1);
        }
       
    }
}