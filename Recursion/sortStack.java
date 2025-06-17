//Link: https://practice.geeksforgeeks.org/problems/sort-a-stack/1
import java.util.Stack;
        //normal stack sort
        // ArrayList<Integer> arr = new ArrayList<>();
        
        // while(!s.isEmpty()){
        //     arr.add(s.pop());
        // }
        
        // Collections.sort(arr);
        
        
        // for(int num: arr){
        //     s.push(num);
        // }
        // return s;
        
        //using recursion
        /*Complete the function below*/
class GfG {
    public Stack<Integer> sort(Stack<Integer> s) {
        // add code here.
       if(!s.isEmpty()){
           int temp = s.pop();
           sort(s);
           insert(s, temp);
       }
       
       
    return s;
        
    }
    
    private void insert(Stack<Integer> s, int temp){
        if(s.isEmpty() || s.peek()<= temp){
            s.push(temp);
            return;
        }
        int top = s.pop();
        insert(s, temp);
        s.push(top);
        
    }
}
    
