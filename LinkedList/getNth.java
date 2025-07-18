//Problem: https://www.geeksforgeeks.org/problems/node-at-a-given-index-in-linked-list/1
class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}


class Solution {
    public int GetNth(Node head, int index) {
        // Code here
        int count = 0;
        
        Node temp = head;
        
        while(temp!= null){
            count++;
            if(count==index){
                return temp.data;
            }
            temp = temp.next;
        }
        
        return -1;
    }
}