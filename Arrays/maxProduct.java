public class maxProduct {
    public int maxProductSubarray(int[] nums) {
        int max = nums[0];
        int min = nums[0];
        int ans = nums[0];

        for(int i = 1; i<nums.length; i++){
            int curr = nums[i];
            
            if(curr < 0){
                int temp = max;
                max = min;
                min = temp;
            }

            max = Math.max(curr, max* curr);
            min = Math.min(curr, min* curr);

            ans = Math.max(max, ans);

            }

             return ans;
        }

        public static void main(String[] args) {
            maxProduct m = new maxProduct();
            int[] arr = {2,3,-2,4};
            System.out.println(m.maxProductSubarray(arr));
        }

}
//leetcode: https://leetcode.com/problems/maximum-product-subarray/
