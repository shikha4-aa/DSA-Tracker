/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int maxSum = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        

        maxGain(root);
        return maxSum;
    }


    private int maxGain(TreeNode node){
        if(node == null) return 0;

        int leftSum = Math.max(maxGain(node.left), 0);
        int rightSum = Math.max(maxGain(node.right), 0);


        maxSum = Math.max(maxSum, node.val + leftSum + rightSum);

        return node.val + Math.max(leftSum, rightSum);


    }
}

// Link: https://leetcode.com/problems/binary-tree-maximum-path-sum/
// Problem: Find the maximum path sum in a binary tree.