
import java.util.ArrayList;
class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        ArrayList<Integer> arr= new ArrayList<>();

        //brute force appraoch. gives TLE for large inputs
       
        int start = 0;
        int end = 0;

        while(end < nums.length){
            
            if(end - start + 1 == k){
              int max = Integer.MIN_VALUE;
              for(int i = start; i<=end; i++){
                max = Math.max(max, nums[i]);
              }

              arr.add(max);
              start++;
            }
            end++;
            
        }
        int res[]= new int[arr.size()];
        for(int i= 0; i< arr.size(); i++){
            res[i] = arr.get(i);
        }
        return res;
    }
}