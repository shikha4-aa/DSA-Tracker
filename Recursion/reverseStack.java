// User function Template for Java
import java.util.Stack;
class Solution {
    static void reverse(Stack<Integer> s) {
        // add your code here
        if(!s.isEmpty()){
            int temp = s.pop();
            reverse(s);
            insert(s, temp);
            
        }
       return;
    }
    
    public static void insert(Stack<Integer> s, int temp){
        
        if(s.isEmpty()){
            s.push(temp);
            return;
        }
        
        int top = s.pop();
        insert(s, temp);
        s.push(top);
    }
}