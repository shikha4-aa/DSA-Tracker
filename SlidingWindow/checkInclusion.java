//Link: https://leetcode.com/problems/permutation-in-string/
// Problem: Given two strings s1 and s2, return true if s2 contains a permutation of s1, or false otherwise.

class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int start = 0;

        int[] freqs1= new int[26];
        int[] freqwindow= new int[26];

        for(int i = 0; i< s1.length(); i++){
            freqs1[s1.charAt(i) - 'a']++;
        }

        for(int end = 0; end < s2.length(); end++){
            freqwindow[s2.charAt(end) - 'a']++; 


            if(end - start + 1 > s1.length()){
                freqwindow[s2.charAt(start)- 'a']--;;
                start++;
            }

            if(end - start + 1 == s1.length()){
                  if(matches(freqs1, freqwindow)){
                    return true;
                  }
            }      
        }
        return false;
    }

    private boolean matches(int a[], int b[]){
        for(int i = 0; i< 26; i++){
            if(a[i]!= b[i]){
                return false;
            }
        }
        return true;
    }
}