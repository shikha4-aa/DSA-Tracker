// LeetCode Problem: https://leetcode.com/problems/maximum-average-subarray-i/

class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int start = 0;
        double avg = 0;
        int sum = 0;
        double max= Double.NEGATIVE_INFINITY; //to handle negative numbers
        
        for(int end = 0; end<nums.length; end++){

            sum+= nums[end];

            if(end - start + 1 == k){
                avg = (double) sum/k;
                max= Math.max(max, avg);
            }

            if(end - start + 1 > k){ // it's a fixed window so can't use while loop
                sum-= nums[start];
                start++;
                 avg = (double) sum/k;
                max= Math.max(max, avg);

                
            }

        }
        return max;
    }
}