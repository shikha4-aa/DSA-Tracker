// Leetcode Problem: https://leetcode.com/problems/implement-stack-using-queues/

import java.util.LinkedList;
import java.util.Queue;
class MyStack {
     Queue<Integer> q ;
    public MyStack() {
        q= new LinkedList<>();
    }
    
    public void push(int x) {
        q.add(x);
        for(int i = 0; i<q.size()-1; i++){
            q.add(q.remove());
        }
    }
    
    public int pop() {
        int x= q.remove();
        return x;
    }
    
    public int top() {
       int x=  q.peek();
       return x;
    }
    
    public boolean empty() {
        if(q.isEmpty()){
            return true;
        }
        return false;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */