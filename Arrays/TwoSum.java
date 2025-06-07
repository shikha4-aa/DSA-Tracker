import java.util.*;
class Solution {
    public static int[] twoSumB(int[] nums, int target) {
        //Brute force
    
        for(int i =0 ; i<nums.length; i++){
            for(int j= i +1; j< nums.length; j++) {
                if(nums[i] + nums[j]== target){
                    return new int[] {i, j};
                }
            }
        }

   return new int[] {};
    }

//optimal approach using hashmap
    public static int[] twoSumO(int[] nums, int target) {
    HashMap<Integer, Integer> mp = new HashMap<>();
    for(int i = 0; i<nums.length; i++){

       int c= target - nums[i];
       if(mp.containsKey(c)){
        return new int[]{i, mp.get(c)};
       }

       mp.put(nums[i], i);
        
    }
    return new int[]{-1, -1};


}
}

