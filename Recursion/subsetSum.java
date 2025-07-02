//Link: https://practice.geeksforgeeks.org/problems/subset-sums2234/1

import java.util.ArrayList;
class Solution {
    public ArrayList<Integer> subsetSums(int[] arr) {
        //gives tle for large inputs tho
        ArrayList<Integer> result = new ArrayList<>();
        backtrack(0, arr, result, 0);
        return result;
    }
    
    
    public void backtrack(int index, int[] arr, ArrayList<Integer> result, int sum){
    
        if(arr.length == index){
            result.add(sum);
            return;
        }
        
        backtrack(index + 1, arr , result, sum + arr[index]);//include the current element
        
        backtrack(index + 1, arr , result, sum); //exlude the current element
        
        
        
    }
}