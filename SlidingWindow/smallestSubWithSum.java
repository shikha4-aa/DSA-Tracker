//Link: https://www.geeksforgeeks.org/smallest-subarray-with-sum-greater-than-x/
// Problem: Given an array of integers and a number x, find the smallest subarray with sum greater than x. If there is no such subarray, return 0.

class Solution {

    public static int smallestSubWithSum(int x, int[] arr) {

        
        int minlen = Integer.MAX_VALUE;
        int start = 0;
        int sum = 0;
        
        for(int end = 0; end<arr.length; end++){
            sum+= arr[end];
            
            while(sum > x){
                minlen = Math.min(minlen, end - start + 1);
                sum-= arr[start];
                start++;
            }
            
        }
        return (minlen==Integer.MAX_VALUE)?0: minlen;      
    }
}
