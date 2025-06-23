//Link: https://leetcode.com/problems/fruit-into-baskets/
//Problem: Given an array of integers representing fruits, you want to collect as many fruits as possible in two baskets. Each basket can only hold one type of fruit. Find the maximum number of fruits you can collect.

import java.util.HashMap;
class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        int start = 0;
        int max= 0;
        
        for(int end = 0; end <fruits.length; end++){
            mp.put(fruits[end], mp.getOrDefault(fruits[end], 0) + 1);

            if(mp.size()>2){
                mp.put(fruits[start], mp.get(fruits[start]) -1);
                if(mp.get(fruits[start])== 0){
                    mp.remove(fruits[start]);
                }
                start++;
            }
            max = Math.max(max, end - start + 1);
        }
        return max;
    }
}