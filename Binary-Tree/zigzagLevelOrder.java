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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {

        List<List<Integer>> result = new ArrayList<>();
        int level = 0;
       
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        if(root == null) return result;

        while(!queue.isEmpty()){
             List<Integer> arr = new ArrayList<>();
             int levelSize = queue.size();

            for(int i = 0; i< levelSize; i++){
               TreeNode temp = queue.remove();
               arr.add(temp.val);

            if(temp.left!= null) queue.add(temp.left);

            if(temp.right!= null) queue.add(temp.right);

        }

        if(level%2 == 1){
            Collections.reverse(arr);
        }
        result.add(arr);
        level++;

        }

        return result;
        
    }
}

// Link: https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/
// Problem: Traverse a binary tree in zigzag level order.