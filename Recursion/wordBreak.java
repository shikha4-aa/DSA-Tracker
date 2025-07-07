//Problem: Given a string s and a dictionary of words wordDict, determine if s can be segmented into a space-separated sequence of one or more dictionary words.
// Link: https://leetcode.com/problems/word-break/

//brute force tho. it gives tle for large inputs
import java.util.List;
class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        return slidingWindow(s, wordDict, 0);
    }


    private boolean slidingWindow(String s, List<String> word,int start){
        if(start == s.length()){
            return true;
        }

        int end = start + 1;
        while(end<=s.length()){
            String window = s.substring(start, end);
            if(word.contains(window)){
                if(slidingWindow(s, word, end)) return true;
            }
            end++;
        }
        return false;
    }
}