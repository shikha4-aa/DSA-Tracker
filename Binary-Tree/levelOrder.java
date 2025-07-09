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
import java.util.List;
import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;

class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if(root == null) return result;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()){
            int levelSize = queue.size();
            List<Integer> current = new ArrayList<>();

            for(int i = 0; i< levelSize; i++){
                TreeNode temp = queue.remove();
                current.add(temp.val);

                if(temp.left!= null) queue.add(temp.left);
                if(temp.right!= null) queue.add(temp.right);
            }

            result.add(current);
        }
       
        return result;
    }
}

//Link: https://leetcode.com/problems/binary-tree-level-order-traversal/