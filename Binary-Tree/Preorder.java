//Link: https://leetcode.com/problems/binary-tree-preorder-traversal/
//Problem: Given the root of a binary tree, return the preorder traversal of its nodes' values.

import java.util.List;
import java.util.ArrayList;
  public class Preorder {
      int val;
     Preorder left;
     Preorder right;
     Preorder() {}
     Preorder(int val) { this.val = val; }
     Preorder(int val, Preorder left, Preorder right) {
          this.val = val;
         this.left = left;
          this.right = right;
      }
  }

class Solution {
    public List<Integer> preorderTraversal (Preorder root) {
        List<Integer> result = new ArrayList<>();
        preorder(root, result);

        return result;
    }


    private void preorder (Preorder node, List<Integer> result){

        if(node == null){
            return;
        }

        result.add(node.val); //root
        preorder(node.left, result); //left
        preorder(node.right, result); //right

    }
}