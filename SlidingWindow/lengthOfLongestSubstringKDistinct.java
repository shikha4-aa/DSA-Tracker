//Link: https://leetcode.com/problems/longest-substring-with-at-most-k-distinct-characters/
//Problem: Find the length of the longest substring with at most k distinct characters.
import java.util.HashMap;
class Main {
    
    public static int lengthOfLongestSubstringKDistinct(String s, int k){
        HashMap<Character, Integer> mp = new HashMap<>();
        int left = 0;
        int maxlen = 0;
        for(int right = 0; right< s.length(); right++){
            char c= s.charAt(right);
            mp.put(c, mp.getOrDefault(c, 0) + 1);
            
            while(mp.size() > k){
                char l = s.charAt(left);
                mp.put(l, mp.get(l) - 1);
                
                if(mp.get(l) == 0){
                    mp.remove(l);
                }
                left++;
            }
            maxlen = Math.max(maxlen, right - left + 1);
            
        }
        
        return maxlen;
    }
    // Example usage
    public static void main(String[] args) {
        int res = lengthOfLongestSubstringKDistinct("eceba", 2);
        
        System.out.println(res);
    }

}