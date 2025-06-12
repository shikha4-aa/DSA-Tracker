//Problem: https://practice.geeksforgeeks.org/problems/insert-a-node-in-doubly-linked-list/1
class Node
{
    int data;
    Node next;
    Node prev;
    Node(int data)
    {
        this.data = data;
        next = prev = null;
    }
}

class Solution {
    // Function to insert a new node at given position in doubly linked list.
    Node addNode(Node head, int p, int x) {
        // Your code here
        
        Node newNode = new Node(x);
        Node temp = head;
        while(p>0){
            temp = temp.next;
            p--;
        }
        
      newNode.prev= temp;
      newNode.next= temp.next;
      
      if(temp.next!= null){
      temp.next.prev= newNode;
      }
      temp.next= newNode;
      
        
        
        return head;
    }
    
}
