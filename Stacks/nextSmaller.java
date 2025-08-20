// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    
    public static int[] nextSmaller(int[] nums){
        Stack<Integer> stack = new Stack<>();
        int[] res = new int[nums.length];
        
        for(int i = nums.length -1 ; i>=0; i--){
            while(!stack.isEmpty() && stack.peek()>= nums[i]){
                stack.pop();
            } 
            if(stack.isEmpty()){
                res[i] = -1;
            } else{
                res[i] = stack.peek();
            }
            
            stack.push(nums[i]);
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr1 = {4, 8, 5, 2, 25};
        int[] arr2 = {13, 7, 6, 12};

        System.out.println(Arrays.toString(nextSmaller(arr1))); // [2, 5, 2, -1, -1]
        System.out.println(Arrays.toString(nextSmaller(arr2)));
    }
}