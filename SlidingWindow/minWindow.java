// Leetcode Problem: https://leetcode.com/problems/minimum-window-substring/
//Problem: Given two strings s and t of lengths m and n respectively, return the length of the smallest substring of s such that it contains all the characters in t (including duplicates).

import java.util.HashMap;
class Solution {
    public String minWindow(String s, String t) {
        HashMap<Character, Integer> mpt = new HashMap<>();
        HashMap<Character, Integer> mpwindow = new HashMap<>();

        int start = 0;
        int count = 0;
        int minlen = Integer.MAX_VALUE;
        int minStart = 0;

        for(char ch: t.toCharArray()){
            mpt.put(ch, mpt.getOrDefault(ch, 0)+ 1);
        } 

        for(int end = 0; end< s.length(); end++){
            char ch= s.charAt(end);
            mpwindow.put(ch, mpwindow.getOrDefault(ch, 0) + 1);


            if(mpt.containsKey(ch)){
                if(mpwindow.get(ch).equals(mpt.get(ch))){
                      count++;
                }
            }

            while(count == mpt.size()){
                    if (end - start + 1 < minlen) {
                       minlen = end - start + 1;
                       minStart = start;
    }

                    mpwindow.put(s.charAt(start), mpwindow.get(s.charAt(start)) - 1);
                    if(mpt.containsKey(s.charAt(start)) && mpwindow.get(s.charAt(start)).intValue() < mpt.get(s.charAt(start)).intValue()){
                        count--;
                    }
                        start++;
                 }
            }
           return (minlen== Integer.MAX_VALUE)?"": s.substring(minStart , minStart + minlen); 
        }
    
}