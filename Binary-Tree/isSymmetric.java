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
    public boolean isSymmetric(TreeNode root) {
        return isMirror(root.left, root.right);
    }

    private boolean isMirror(TreeNode n1, TreeNode n2){
        if(n1 == null && n2== null) return true;

        if(n1== null || n2== null) return false;

        if(n1.val != n2.val) return false;

        return isMirror(n1.left, n2.right) && isMirror(n1.right, n2.left);
    }
}

// Link: https://leetcode.com/problems/symmetric-tree/
// Problem: Check if a binary tree is symmetric around its center.