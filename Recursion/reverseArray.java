//Problem: Reverse an array using recursion
//Link: https://practice.geeksforgeeks.org/problems/reverse-an-array-using-recursion/1

class Solution {
    public void reverseArray(int arr[]) {
        // code here
         reverse(arr, 0, arr.length-1);
          
    }
    
    private void reverse(int arr[], int start, int end){
        if(start == end || start > end){
            return;
        }
        
        int temp = arr[start];
        arr[start]= arr[end];
        arr[end]= temp;
        
        reverse(arr, start + 1, end - 1);
    }
    
   
}