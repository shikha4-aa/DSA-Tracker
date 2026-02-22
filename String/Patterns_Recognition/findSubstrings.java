package Patterns_Recognition;

import java.util.ArrayList;
import java.util.List;

public class findSubstrings {
    public static List<String> findSubstringsf(String s){
        
        List<String> ans = new ArrayList<>();
        for(int i = 0; i < s.length(); i++){
            for(int j = i; j< s.length(); j++){
                ans.add(s.substring(i, j+1));
            }
        }
        
        return ans;
        
    }
    public static void main(String[] args) {
        String s = "abc";
        List<String> ans = findSubstringsf(s);
        for (String i : ans) {
            System.out.print(i + " ");
        }
    }
}
