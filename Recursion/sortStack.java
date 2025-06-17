import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;
class GfG {
    public Stack<Integer> sort(Stack<Integer> s) {
        //normal stack sort
        ArrayList<Integer> arr = new ArrayList<>();
        
        while(!s.isEmpty()){
            arr.add(s.pop());
        }
        
        Collections.sort(arr);
        
        
        for(int num: arr){
            s.push(num);
        }
        return s;
        
    }
}