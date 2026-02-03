//Problem: https://leetcode.com/problems/remove-duplicates-from-sorted-array/

/*Core Observations:
1. Input Array is Sorted:
  That’s why duplicates are consecutive. We don’t need a hashmap or set.
2. In-place Modification:
We are not allowed to use extra space.
So two-pointer technique is a must.  */

class removeDuplicates {
    public int removeDuplicatesArray(int[] nums) {
        int i= 0;
        for(int j=1; j<nums.length; j++){
            if(nums[i]!= nums[j]){
                i++;
                nums[i]= nums[j];
            }
        }
        return i+1;
    }

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        
        System.out.print("Enter the size of array: ");
        int n = scanner.nextInt();
        
        int[] nums = new int[n];
        System.out.println("Enter " + n + " sorted numbers:");
        for(int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        
        removeDuplicates obj = new removeDuplicates();
        int count = obj.removeDuplicatesArray(nums);
        
        System.out.println("\nArray after removing duplicates:");
        for(int i = 0; i < count; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println("\n\nNumber of unique elements: " + count);
        
        scanner.close();
    }
}