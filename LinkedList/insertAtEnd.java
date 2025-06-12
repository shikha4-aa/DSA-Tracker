//Problem link: https://practice.geeksforgeeks.org/problems/insertion-at-the-end-of-linked-list/1
class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}

class Solution {
    public Node insertAtEnd(Node head, int x) {
        // code here
        
        Node newNode= new Node(x);
        Node temp = head;
        
        if(head==null){
            return newNode;
        }
        while(temp.next!= null){
            temp= temp.next;
        }
        
        temp.next= newNode;
        return head;
    }
}