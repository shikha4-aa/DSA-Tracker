//Link: https://leetcode.com/problems/subsets/
import java.util.ArrayList;
import java.util.List;
class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(0, nums, new ArrayList<>(), result);

        return result;
    }

    public void backtrack(int index, int[] nums, ArrayList<Integer> current, List<List<Integer>> result){
        if(index == nums.length){
        result.add(new ArrayList(current));
        return;
    }

        current.add(nums[index]);
        backtrack(index+ 1, nums, current, result);

        current.remove(current.size()- 1); // backtrack (exclude the current element)
         backtrack(index+ 1, nums, current, result);
    }
}