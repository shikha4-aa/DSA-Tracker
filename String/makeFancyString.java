class Solution {
    public String makeFancyString(String s) {
        StringBuilder res = new StringBuilder();

        for(int i = 0; i< s.length(); i++){
            int len = res.length();
            if(len>=2 && res.charAt(len - 1)== s.charAt(i) && res.charAt(len-2)== s.charAt(i)){
                continue;
            }

            res.append(s.charAt(i));
        }

        return res.toString();
    }
}

// Link: https://leetcode.com/problems/make-the-string-great/
// Problem: Remove adjacent duplicates in a string such that no character appears more than twice consecutively