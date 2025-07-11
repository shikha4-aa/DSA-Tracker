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
    int diameter = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        height(root);
        return diameter;
    }

    private int height(TreeNode node){
        if(node == null) return 0;

        int left = height(node.left);
        int right = height(node.right);

        diameter = Math.max(diameter, left+ right); //This line is just for updating the global tracker.

       return Math.max(left, right) + 1; //Returns the height to the parent node
    }
}

//Link: https://leetcode.com/problems/diameter-of-binary-tree/
//Problem: Find the diameter of a binary tree, which is the length of the longest path between any two nodes in the tree.