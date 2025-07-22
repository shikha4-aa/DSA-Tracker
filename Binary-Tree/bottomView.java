/*
class Node
{
    int data; //data of the node
    int hd; //horizontal distance of the node
    Node left, right; //left and right references

    // Constructor of tree node
    public Node(int key)
    {
        data = key;
        hd = Integer.MAX_VALUE;
        left = right = null;
    }
}
*/
import java.util.*;
class Solution {
    class Pair {
        Node node;
        int hd;
        Pair(Node node, int hd) {
            this.node = node;
            this.hd = hd;
        }
    }
    public ArrayList<Integer> bottomView(Node root) {
        // Code here
        Map<Integer, Integer> mp = new TreeMap<>();
        ArrayList<Integer> result = new ArrayList<>();
        
        Queue<Pair> queue = new LinkedList<>();
        queue.add(new Pair(root, 0));
        
        while(!queue.isEmpty()){
            Pair temp = queue.remove();
            Node node = temp.node;
            int hd = temp.hd;
            
             mp.put(hd, node.data);
             
            if(node.left!= null) queue.add(new Pair(node.left, hd-1));
            if(node.right!= null) queue.add(new Pair(node.right, hd+1));
            
        }
            
            for(int val: mp.values()){
                result.add(val);
            }
        
        return result;
    }
}
// Link: https://practice.geeksforgeeks.org/problems/bottom-view-of-binary-tree/1
// Problem: Given a binary tree, print the bottom view of it. The bottom view is the set of nodes visible when the tree is viewed from the bottom.