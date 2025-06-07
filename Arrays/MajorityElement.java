
//Problem link : https://leetcode.com/problems/majority-element/
import java.util.*;
class Solution {
    public int majorityElement(int[] nums) {
        // int count=0;
        // int c=0;
        // for(int i=0; i<nums.length; i++){
        //     if(count==0){
        //         c= nums[i];
        //     }
        //     if(nums[i]==c){
        //         count++;
        //     } else{
        //         count--;
        //     }
        // }
        // return c;

        //using hashmap

        HashMap<Integer, Integer> mp= new HashMap<>();
        int n = nums.length;
        for(int num: nums){
           mp.put(num, mp.getOrDefault(num, 0) + 1);
           if(mp.get(num)> n/2){
            return num;
           }
        
    }
    return -1;
    }
}