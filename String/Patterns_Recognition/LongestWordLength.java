package Patterns_Recognition;

public class LongestWordLength {
     public static int LongestWordLengthf(String s){
        
        int count = 0;
        int maxc= 0;
        char arr[] = s.toCharArray();
        
        for(char ch: arr){
            if(ch!= ' '){
                count++;
            } else{
                maxc= Math.max(count, maxc);
                count = 0;
            }
        }
        
        return Math.max(count, maxc);
    }
    public static void main(String[] args) {
        String s = "I am an intern at geeksforgeeks";
        System.out.println(LongestWordLengthf(s));
    }
}
