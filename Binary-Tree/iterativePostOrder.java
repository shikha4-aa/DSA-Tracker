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

 // Link: https://leetcode.com/problems/binary-tree-postorder-traversal/
import java.util.*;
class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
         List<Integer> result = new ArrayList<>();

    Stack<TreeNode> s1 = new Stack<>();
    Stack<TreeNode> s2 = new Stack<>();

    if(root == null) return result;

    s1.push(root);

    while(!s1.isEmpty()){

        TreeNode temp = s1.pop();
        s2.push(temp);

        if(temp.left!= null) s1.push(temp.left);
        if(temp.right!= null) s1.push(temp.right);
      }

      while(!s2.isEmpty()){
       
        result.add(s2.pop().val);

      }
      return result;
    }
}

/*So in steps:
🔍 You realize postorder is hard to track using a single stack because you must visit the root only after both left & right are done

🧠 So you think: “What’s the easiest order to get?”

Preorder is easy with stack → Root → Left → Right

Reverse that → Root → Right → Left

💡 And then you say:

“If I reverse Root → Right → Left, I’ll get Left → Right → Root = Postorder!”

So you:
Use 1st stack to simulate reverse preorder
Use 2nd stack to collect nodes in the reverse visit order
Pop from 2nd stack to get the final postorder */