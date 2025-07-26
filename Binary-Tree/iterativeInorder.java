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
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
    if(root == null) return result;
    Stack<TreeNode> stack = new Stack<>();
    TreeNode temp = root;

    while(temp!= null || !stack.isEmpty()){
        while(temp!= null){
            stack.push(temp);
            temp = temp.left;
        }
      temp = stack.pop();
      result.add(temp.val);
      temp= temp.right;

    }
    return result;
    
    }
}
// Link: https://leetcode.com/problems/binary-tree-inorder-traversal/
// Problem: Given a binary tree, return the inorder traversal of its nodes' valuesively, so we remove the third 'e' to get "leetcode".
 //Example: Input: [1,null,2,3] Output: [1,3,2]
// Explanation: The inorder traversal of the binary tree is [1, 3, 2