/*
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}
*/

class Solution {
    // Function to return a list of nodes visible from the top view
    // from left to right in Binary Tree.
    static class Pair {
    Node node;
    int hd; // horizontal distance
    Pair(Node node, int hd) {
        this.node = node;
        this.hd = hd;
    }
}
    static ArrayList<Integer> topView(Node root) {
        // code here
        if(root == null) return new ArrayList<>();
        
        Map<Integer, Integer> mp = new TreeMap<>();
        Queue<Pair> q = new LinkedList<>();
        
        q.add(new Pair(root, 0));
        
        
        while(!q.isEmpty()){
            Pair p = q.remove();
            Node temp = p.node;
            int hd = p.hd;
            
            
            if(!mp.containsKey(hd)){
                mp.put(hd, temp.data);
            }
            
            if(temp.left!= null) q.add(new Pair(temp.left, hd - 1));
            if(temp.right!= null) q.add(new Pair(temp.right, hd+1));
        }
            
            ArrayList<Integer> result = new ArrayList<>();
            for(int val: mp.values()){
                result.add(val);
            }
            
        return result;
        
    }
}

// Link: https://practice.geeksforgeeks.org/problems/top-view-of-binary-tree/1
// Problem: Print the top view of a binary tree.