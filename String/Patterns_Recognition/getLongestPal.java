package Patterns_Recognition;

import java.util.Scanner;

public class getLongestPal {
     public static String getLongestPalf(String s) {
        String ans = "";
        for(int i = 0; i< s.length(); i++){
            for(int j = i; j<s.length(); j++){
                
                if(isPalindrome(s, i, j)){
                
                if(j-i+1 > ans.length()){
                    ans = s.substring(i, j+1);
                }
            }
            
            }
        }
        
        return ans;
        
    }
    
    
    public static boolean isPalindrome(String s, int left, int right){
        
        while(left < right){
            
            if(s.charAt(left)!= s.charAt(right)){
                return false;
            }
            
            left++;
            right--;
        }
        
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(getLongestPalf(s));
        sc.close();
    }
}
