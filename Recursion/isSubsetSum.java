
//Link: https://practice.geeksforgeeks.org/problems/subset-sum-problem-1611555638/1
class Solution {

    static Boolean isSubsetSum(int arr[], int sum) {
        // code here
        return backtrack(0, arr, sum, 0);
    }
    
    private static boolean backtrack(int index, int arr[], int sum, int res){
        
        if(res > sum){
            return false;
        }
        if(index == arr.length){
            if(res == sum) {
                return true;
                
            }
            return false;
        }
        
        res+= arr[index];
        if(backtrack(index + 1, arr, sum, res)) return true;
        
        res-= arr[index];//backtrack
        if(backtrack(index+1, arr, sum, res)) return true;
        
        
        return false;
    }
}