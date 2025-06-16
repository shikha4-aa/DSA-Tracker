//Problem: https://leetcode.com/problems/valid-palindrome/

//by recursion
class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder st = new StringBuilder();

        for(char ch: s.toCharArray()){
            if(Character.isLetterOrDigit(ch)){
                st.append(Character.toLowerCase(ch));
            }
        }
      return check(st.toString(), 0, st.length()-1);

    }

    private boolean check(String s, int start, int end){
           
           if(start> end){
            return true;
           }
        if(s.charAt(start)!= s.charAt(end)){
            return false;
        }

        return check(s, start+1, end-1);
    }
}