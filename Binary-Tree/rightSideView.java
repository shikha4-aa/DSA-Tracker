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
    public List<Integer> rightSideView(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
         List<Integer> res = new ArrayList<>();

        if(root == null) return res;

        queue.add(root);

        while(!queue.isEmpty()){
            int levelSize = queue.size();


            for(int i = 0; i< levelSize; i++){
                TreeNode temp = queue.remove();

                if(i== levelSize - 1){
                  res.add(temp.val);
                }

                if(temp.left!= null) queue.add(temp.left);
                if(temp.right!= null) queue.add(temp.right);
            }


        }

        return res;
    }
}