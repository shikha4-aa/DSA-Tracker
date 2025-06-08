//Problem link: https://leetcode.com/problems/longest-substring-without-repeating-characters/

import java.util.HashMap; 
class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> mp = new HashMap<>();
        int start = 0;
        int maxl = 0;
       for(int end = 0; end <s.length(); end++){
        char ch= s.charAt(end);


       //max() bc sometimes the characters repeats in previous window and start is already ahead of it
        if(mp.containsKey(ch)){
            start= Math.max(start, mp.get(ch) + 1);
        }

        mp.put(ch, end);
        maxl= Math.max(end - start + 1, maxl);

       }

       return maxl;
        }
    }
