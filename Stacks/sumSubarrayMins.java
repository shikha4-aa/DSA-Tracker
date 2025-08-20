import java.util.Stack;
class Solution {
    public int sumSubarrayMins(int[] arr) {
        // long sum = 0;
        // int MOD = (int)1e9 + 7;
        // for(int i = 0; i<arr.length; i++){
        //     int minVal = arr[i];
        //     for(int j = i; j<arr.length ; j++){
        //         minVal = Math.min(minVal, arr[j]);
        //         sum = (sum+ minVal) % MOD;
        //     }
        // }
        // return (int)sum;

        int n = arr.length;
        int mod = (int)1e9 + 7;

        int[] left = new int[n];
        int[] right = new int[n];

        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i< n ; i++){
            while(!stack.isEmpty() && arr[stack.peek()]> arr[i]){
                stack.pop();
            }

            if(stack.isEmpty()){
                left[i] = i+1;
            } else {
                left[i]= i-stack.peek();
            }

            stack.push(i);
        }

      stack.clear();
        //next greater element
        for(int i = n-1; i>=0; i--){
            while(!stack.isEmpty() && arr[stack.peek()] >= arr[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                right[i] = n-i;
            } else {
                right[i]= stack.peek() - i;
            }
            stack.push(i);
        }


        long res = 0;
        for(int i = 0; i<n; i++){
            long c = (long)arr[i]* left[i]*right[i];
            res= (res+c)% mod;
        }
        return (int)res;
    }
}

//link: https://leetcode.com/problems/sum-of-subarray-minimums/
//Problem: Given an array of integers, return the sum of the minimums of all subarrays modulo 10^9 + 7.