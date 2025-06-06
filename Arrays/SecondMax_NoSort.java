class Solution {
    public static int largestNumber(int[] nums){
        int large= nums[0];
           for(int i=1; i<nums.length; i++){
             if(large <nums[i]){
                large= nums[i];
             }
           }
           return large;
    }


    public static int secondLargestElement(int[] nums) {
        int large= largestNumber(nums);
        int secondlarge= -1;
        for(int i=0; i<nums.length; i++){
            if(large!= nums[i] && large> nums[i]){
                secondlarge= nums[i];
                 
            }

            

          
    }
   return secondlarge;
}
}