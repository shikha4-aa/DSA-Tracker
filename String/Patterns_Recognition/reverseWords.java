package Patterns_Recognition;
import java.util.Stack;

public class reverseWords {
    public static String reverseWordsf(String s) {
        
        String[] words = s.split("\\.+");
        Stack<String> stack = new Stack<>(); //to store the words
        
        for(String word: words){
             if (!word.isEmpty()) { //skip empty words
                stack.push(word);
            }
        }
        
        StringBuilder sb = new StringBuilder();
        
        while(!stack.isEmpty()){
            sb.append(stack.pop());
            
            if(!stack.isEmpty()){
                sb.append(".");
            }
        }
        
        return sb.toString();        
    }

    public static void main(String[] args) {
        String s = "i.like.this.program.very.much";
        System.out.println(reverseWordsf(s));
    }
}
