//link: https://practice.geeksforgeeks.org/problems/infix-to-postfix-1587115620/1
import java.util.Stack;
class Solution {
    public static String infixToPostfix(String s) {
        // code here
        StringBuilder res = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        
        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            
            
            if(Character.isLetterOrDigit(ch)){
                res.append(ch);
            }
            
            else if(ch == '('){
                stack.push(ch);
            }
            
            else if(ch== ')'){
                while(!stack.isEmpty() && stack.peek()!='('){
                    res.append(stack.pop());
                }
                
                if(!stack.isEmpty() && stack.peek()== '('){
                    stack.pop();
                }
            }
            
            else{
                while(!stack.isEmpty() && precedence(ch) <= precedence(stack.peek())){
                    if(stack.peek() == '(')break;
                    
                    res.append(stack.pop());
                }
                
                stack.push(ch);
            }
        }
        
        while(!stack.isEmpty()){
            res.append(stack.pop());
        }
        
        return res.toString();
    }
    
    private static int precedence(char op){
        if(op=='+' || op=='-') return 1;
        if(op== '*' || op=='/') return 2;
        if(op=='^') return 3;
        
        return -1;
    }
}

