//Link: https://practice.geeksforgeeks.org/problems/count-the-anagrams-of-a-string/1
//Problem: Count the Anagrams of a String
import java.util.Arrays;

class Solution {

    int search(String pat, String txt) {
        // code here
        int k = pat.length();
        int n = txt.length();
        int count = 0;

        // Frequency array for pattern
        int[] patFreq = new int[26];
        for (char c : pat.toCharArray()) {
            patFreq[c - 'a']++;
        }

        int[] windowFreq = new int[26];
        for (int i = 0; i < n; i++) {
            // Add current character to window
            windowFreq[txt.charAt(i) - 'a']++;

           
            if (i >= k) {
                windowFreq[txt.charAt(i - k) - 'a']--;
            }

          
            if (i >= k - 1 && Arrays.equals(patFreq, windowFreq)) {
                count++;
            }
        }

        return count;
        
    }
}