// Leetcode Problem: https://leetcode.com/problems/palindrome-partitioning/
//Problem: Given a string s, partition s such that every substring of the partition is a palindrome. Return all possible palindrome partitioning of s.

import java.util.ArrayList;
import java.util.List;
class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> result = new ArrayList<>();
        backtrack(s, result, new ArrayList<>(), 0);

        return result;
    }

    public boolean isPalindrome(String s, int start, int end){
        while(start< end){
            if(s.charAt(start)!= s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public void backtrack(String s, List<List<String>> result, List<String> current, int index){
       
        if(s.length() == index){
            result.add(new ArrayList<>(current));
            return;
    }

        for(int i = index; i<s.length(); i++){
            if(isPalindrome(s, index, i)){
                String p = s.substring(index, i+1);
                current.add(p);
                backtrack(s, result, current, i + 1);
                current.remove(current.size() - 1);

            }
        }
    }
}