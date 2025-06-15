//Problem: https://leetcode.com/problems/rotate-array/

/*🧠 Pattern Name: Array Rotation Using Reversal
It’s a standard pattern for cyclic array operations. This idea of reversing subarrays is used in:
Rotating arrays (this problem)
Rotating matrices (via transpose + reverse)
Shifting characters
Deque or circular buffer problems

You’ve got to recognize this is a rotation → so use reverse trick.
 */

class Solution {
    public void rotate(int[] nums, int k) {
        int n= nums.length;
        k= k%n;

    reverse(nums, 0, n-1);

    reverse(nums, 0, k-1);

    reverse(nums, k, n-1);
    
}

private void reverse(int[] nums, int start, int end){

    while(start< end){
        int temp = nums[end];
        nums[end]= nums[start];
        nums[start]= temp;
        start++;
        end--;
    }

}
}