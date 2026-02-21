package Patterns_Recognition;

public class areRotations {
    public boolean areRotationsf(String s1, String s2) {
       
        String d = s1+ s1;
        int[] lps = createLPS(s2);
        
        int n = d.length();
        int m = s2.length();
        
        int i = 0;
        int j = 0;
        
        while(i < n){
            if(d.charAt(i) == s2.charAt(j)){
                i++;
                j++;
            }
            
            if(m == j){
                return true;
            } else if(i< n && d.charAt(i) != s2.charAt(j)){
                if(j!=0){
                    j = lps[j-1];
                } else{
                    i++;
                }
            }
        }
        
        return false;

    }
    
    public int[] createLPS(String s2){
        int[] lps = new int[s2.length()];
        
        int i = 1;
        lps[0] = 0;
        
        int len = 0;
        
        while(i < s2.length()){
            if(s2.charAt(i) == s2.charAt(len)){
                len++;
                lps[i] = len;
                i++;
            } else{
                if(len!= 0){
                    len = lps[len - 1];
                } else{
                    len = 0;
                    i++;
                }
            }
        }
        
        return lps;
    }
}
