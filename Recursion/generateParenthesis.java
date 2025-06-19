// LeetCode Problem: https://leetcode.com/problems/generate-parentheses/

import java.util.ArrayList;
import java.util.List;
class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result= new ArrayList<>();
        backtrack(result, "", n, n);
        return result;
    }

    private void backtrack(List<String> result, String c, int open, int close){
        
        if(open ==0 && close == 0){
            result.add(c);
            return;
        }

        if(open > 0){
            backtrack(result, c + "(", open - 1, close);
        }

        if(open < close){
            backtrack(result, c+ ")", open, close-1);
        }

    }
}