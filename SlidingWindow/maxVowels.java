//Link: https://leetcode.com/problems/maximum-number-of-vowels-in-a-substring-of-given-length/
// Problem: Given a string s and an integer k, return the maximum number of vowel letters in any substring of s with length k. Vowel letters in English are 'a', 'e', 'i', 'o', and 'u'.

class Solution {
    public int maxVowels(String s, int k) {
        int start = 0;
        int count = 0;
        int end = 0;
        int max = 0;

        while(end< s.length()){
            char ch = s.charAt(end);
            if(isVowel(ch)){
                count++;
            }

            if(end - start + 1 > k){
                if(isVowel(s.charAt(start))){
                    count--;
                }
                start++;
            }

            if(end - start + 1== k){
                max= Math.max(max, count);
            }
            end++;
        }
    return max;

    }

    private boolean isVowel(char ch){
        return ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u';
    }
}