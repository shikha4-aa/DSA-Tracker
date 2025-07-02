//Link: https://leetcode.com/problems/letter-combinations-of-a-phone-number/
// Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent. Return the answer in any order.

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        HashMap<Character, String> mp = new HashMap<>();
        mp.put('2', "abc");
        mp.put('3', "def");
        mp.put('4', "ghi");
        mp.put('5', "jkl");
        mp.put('6', "mno");
        mp.put('7', "pqrs");
        mp.put('8', "tuv");
        mp.put('9', "wxyz");

        if(digits== null || digits.length()==0){
            return result;
        }

        backtrack(digits, 0, new StringBuilder(), mp, result);
        return result;

    }


    public void backtrack(String digits, int index, StringBuilder current, HashMap<Character, String> mp, List<String> result){

        if(digits.length() == index){
            result.add(current.toString());
            return;
        }


        String s = mp.get(digits.charAt(index));
        for(char ch: s.toCharArray()){
            current.append(ch);
            backtrack(digits, index + 1, current, mp, result);
            current.deleteCharAt(current.length() - 1);
        }
    }
}