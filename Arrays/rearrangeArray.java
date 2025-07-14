//Link: https://leetcode.com/problems/rearrange-array-elements-by-sign/
//Problem: Rearrange an array such that positive and negative numbers alternate, starting with a positive

import java.util.ArrayList;
import java.util.List;
class Solution {
    public int[] rearrangeArray(int[] nums) {
        List<Integer> pos = new ArrayList<>();
        List<Integer> neg = new ArrayList<>();

        for(int num: nums){
            if(num>0){
                pos.add(num);
            } else{
                neg.add(num);
            }
        }

        int[] result = new int[nums.length];

        int i =0, p =0 , n= 0;

        while(p<pos.size() && n<neg.size()){
            result[i++] = pos.get(p++);
            result[i++] = neg.get(n++);
        }
        return result;
    }
}