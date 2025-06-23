//Link: https://leetcode.com/problems/find-all-anagrams-in-a-string/
// Problem: Given two strings s and p, return an array of all the start indices of p's anagrams in s. You may return the answer in any order.

import java.util.*;
class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int start = 0;
        ArrayList<Integer> arr= new ArrayList<>();
        int[] freqp= new int[26];
        int[] freqs= new int[26];


        for(int i = 0; i<p.length(); i++){
            freqp[p.charAt(i) - 'a']++;
        }

        for(int end = 0; end< s.length(); end++){
               freqs[s.charAt(end)-'a']++;

               if(end - start + 1 > p.length()){
                freqs[s.charAt(start)-'a']--;
                start++;
               }

               if(p.length() == end- start+ 1){
                    if(match(freqs, freqp)){
                       arr.add(start);
                }
             }
        }
        return arr;
    }
    private boolean match(int a[], int b[]){
        for(int i = 0; i< 26; i++){
            if(a[i]!= b[i]){
                return false;
            }
        }
        return true;
    }
}