//Problem: https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
class Solution {
    public int[] searchRange(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return new int[] {-1, -1};
        }
        
       
        if (target < nums[0] || target > nums[nums.length - 1]) {
            return new int[] {-1, -1};
        }
        
        int f = findFirst(nums, target);
        int l = findLast(nums, target);
        return new int[] {f, l};
    }
    
    
    private int findFirst(int[] nums, int target) {
        int low = 0, high = nums.length - 1;
        int result = -1;
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            
            if (nums[mid] == target) {
                result = mid; 
                high = mid - 1; 
            } else if (nums[mid] < target) {
                low = mid + 1; 
            } else {
                high = mid - 1; 
            }
        }
        return result;
    }
    
    
    private int findLast(int[] nums, int target) {
        int low = 0, high = nums.length - 1;
        int result = -1;
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            
            if (nums[mid] == target) {
                result = mid; 
                low = mid + 1; 
            } else if (nums[mid] < target) {
                low = mid + 1; 
            } else {
                high = mid - 1; 
            }
        }
        return result;


    }
}