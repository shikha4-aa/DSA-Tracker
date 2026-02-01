//leetcode: https://leetcode.com/problems/maximum-subarray/

public class maxSubArray {
    public int maximumSubArray(int[] nums) {
        int maxSum = nums[0];
        int sum= 0;
        for(int i = 0; i<nums.length; i++){
             sum+= nums[i];
            maxSum = Math.max(sum, maxSum);

// kaden's logic
            if(sum < 0){
                sum = 0; // drop the neg
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {
        maxSubArray ms = new maxSubArray();
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(ms.maximumSubArray(arr));
    }
}

