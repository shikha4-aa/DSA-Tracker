/* Linklist node structure
class Node
{
    int data;
    Node next;

    Node(int d)
    {
        data = d;
        next = null;
    }
}*/
class Solution {
    Node deleteNode(Node head, int x) {
        // code here
        Node temp = head;
        Node prev = temp;
        
        if(x==1){
            head = temp.next;
            return head;
        }
   
        
        while(x>1){
            
            prev= temp;
            temp= temp.next;
           x--;
        }
        prev.next= temp.next;
        return head;
    }
}
//Problem Link: https://practice.geeksforgeeks.org/problems/delete-x-th-node-in-a-linked-list/1