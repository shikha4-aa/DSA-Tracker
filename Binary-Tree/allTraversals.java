//Problem: Given a binary tree, return its preorder, inorder, and postorder traversal in a single function using iterative approach.
// You can use a single stack to achieve this by maintaining a state for each node.

import java.util.*;
class TreeNode{
    int val;
    TreeNode left, right;
    TreeNode(int val){
        this.val = val;
    }
}

class Pair{
    TreeNode node;
    int state;
    
    Pair(TreeNode node, int state){
        this.node = node;
        this.state = state;
    }
}

class Main {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left= new TreeNode(4);
        root.left.right = new TreeNode(5);
        
        allTraversals(root);
    }
    
    static void allTraversals(TreeNode root){
        List<Integer> preorder = new ArrayList<>();
        List<Integer> inorder = new ArrayList<>();
        List<Integer> postorder = new ArrayList<>();
        
        if(root == null) return;
        
        Stack<Pair> stack = new Stack<>();
        stack.push(new Pair(root, 1));
        
        while(!stack.isEmpty()){
            Pair top = stack.pop();
            if(top.state == 1){
                preorder.add(top.node.val);
                top.state++;
                stack.push(top);
                
                if(top.node.left!= null){
                    stack.push(new Pair(top.node.left, 1));
                }
            }
            
            else if(top.state== 2){
                inorder.add(top.node.val);
                top.state++;
                stack.push(top);
                
                if(top.node.right!= null){
                    stack.push(new Pair(top.node.right, 1));
                }
            }
            
            else{
                postorder.add(top.node.val);
            }
        }
        System.out.println("Preorder  : " + preorder);
        System.out.println("Inorder   : " + inorder);
        System.out.println("Postorder : " + postorder);
        
        
    }
}