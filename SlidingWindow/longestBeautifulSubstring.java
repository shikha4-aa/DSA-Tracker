// LeetCode Problem: https://leetcode.com/problems/longest-beautiful-substring-of-a-string/
//Problem Statement: A string is beautiful if it contains all 5 characters: 'a', 'e', 'i', 'o', and 'u' at least once. Given a string word, return the length of the longest beautiful substring of word. If there is no beautiful substring, return 0.

class Solution {
    public int longestBeautifulSubstring(String word) {
        int len = 0;
        int max = 0;
        int count = 0;

        for(int end = 0; end<word.length(); end++){
            char ch = word.charAt(end);
            if(end > 0 && ch >= word.charAt(end-1)){
                len++;
                if(ch > word.charAt(end - 1)){
                    count++;
                }
            } else{
                len = (ch=='a')? 1: 0;
                count = (ch=='a')? 1: 0;
            }

            if(count==5){
                max= Math.max(max, len);
            }
        }
        return max;
    }
}