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
    public boolean isBalanced(TreeNode root) {
        if(root == null) return true;

        int left = height(root.left);
        int right = height(root.right);

        if(Math.abs(left - right)>1) return false;

        return isBalanced(root.left) && isBalanced(root.right);
    }

    private int height(TreeNode node){
        if(node == null) return 0;

        return Math.max(height(node.left),  height(node.right)) + 1;
    }
}

//Link: https://leetcode.com/problems/balanced-binary-tree/

//Mistakes: 
// Not checking the balance condition at each node. The real fail happens when root is balanced but its subtrees are not.