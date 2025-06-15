//Problem: https://leetcode.com/problems/remove-duplicates-from-sorted-array/

/*Core Observations:
1. Input Array is Sorted:
  That’s why duplicates are consecutive. We don’t need a hashmap or set.
2. In-place Modification:
We are not allowed to use extra space.
So two-pointer technique is a must.  */

class Solution {
    public int removeDuplicates(int[] nums) {
        int i= 0;
        for(int j=1; j<nums.length; j++){
            if(nums[i]!= nums[j]){
                i++;
                nums[i]= nums[j];
            }
        }
        return i+1;

}
}