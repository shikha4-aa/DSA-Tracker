// User function Template for Java
import java.util.Stack;
class Solution {
    static String preToPost(String pre_exp) {
        // code here
        
        Stack<String> stack = new Stack<>();
        for(int i = pre_exp.length() -1 ; i>=0 ; i--){
            char ch = pre_exp.charAt(i);
            
            
            
            if(Character.isLetterOrDigit(ch)){
                stack.push(ch+ "");
            } else{
                String op1 = stack.pop();
                String op2 = stack.pop();
                String s = op1 + op2+ ch;
                stack.push(s);
            }
        }
        
        return stack.peek();
    }
}
// Problem link: https://practice.geeksforgeeks.org/problems/pre-to-post-conversion/1