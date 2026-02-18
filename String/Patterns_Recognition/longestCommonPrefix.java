package Patterns_Recognition;

import java.util.Arrays;

public class longestCommonPrefix {
     public String longestCommonPrefixf(String arr[]) {
        // code here
        
        // String smallest = arr[0];
        // for(String s: arr){
        //     if(s.length() < smallest.length()){
        //         smallest = s;
        //     }
            
        // }
        
        // for(int i = 0; i<smallest.length(); i++){
            
        //     for(String s: arr){
        //         if(s.charAt(i)!= smallest.charAt(i)){
        //             return smallest.substring(0, i);
        //         }
        //     }
            
        // }
        
        // return smallest;

        int n = arr.length;
        Arrays.sort(arr);
        String first = arr[0];
        String last = arr[n - 1];
        
        int minLength = Math.min(first.length(), last.length());
        
        int i = 0;
        while(i < minLength && first.charAt(i) == last.charAt(i)){
            i++;
        }
        
        return first.substring(0, i);
        
    }
}
