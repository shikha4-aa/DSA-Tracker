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
import java.util.*;
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();


    if(root == null) return result;

    Stack<TreeNode> stack = new Stack<>();
    stack.push(root);

    while(!stack.isEmpty()){
         TreeNode temp= stack.pop();
         result.add(temp.val);
 
         //push right first so that left will be out first
         //because stack is LIFO
         if(temp.right!= null) stack.push(temp.right);
         if(temp.left!= null) stack.push(temp.left);

      }
      return result;
   }
}

// Link: https://leetcode.com/problems/binary-tree-preorder-traversal/