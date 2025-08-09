import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
      Map<Integer, Integer> greater = new HashMap<>();
      Stack<Integer> stack = new Stack<>();

      for(int i = nums2.length-1; i>=0; i--){

        while(!stack.isEmpty() && stack.peek()<= nums2[i]){
            stack.pop();
        }


        if(stack.isEmpty()){
            greater.put(nums2[i], -1);
        } else{
            greater.put(nums2[i], stack.peek());
        }

        stack.push(nums2[i]);
      }
      
      int[] res= new int[nums1.length];
      for(int i = 0; i<nums1.length; i++){
        res[i] = greater.get(nums1[i]);

      }
  return res;
    }
}

//link: https://leetcode.com/problems/next-greater-element-i/