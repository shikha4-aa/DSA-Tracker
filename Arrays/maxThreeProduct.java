import java.util.Arrays;
import java.util.Scanner;

 public class maxThreeProduct {
 public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;

        int p1 = nums[0] * nums[1] * nums[n-1]; // two smallest and largest (makes max product)
        int p2 = nums[n-1] * nums[n-2] * nums[n-3]; // last three largest

        return Math.max(p1, p2);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        sc.close();
        
        maxThreeProduct obj = new maxThreeProduct();
        System.out.println("Maximum product: " + obj.maximumProduct(nums));
    }
}

//leetcode: https://leetcode.com/problems/maximum-product-of-three-numbers/