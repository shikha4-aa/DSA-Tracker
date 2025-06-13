//Problem: Reverse a Doubly Linked List
class DLLNode {
    int data;
    DLLNode next;
    DLLNode prev;

    DLLNode(int val) {
        data = val;
        next = null;
        prev = null;
    }
}

class Solution {
    public DLLNode reverseDLL(DLLNode head) {
        // Your code here
        DLLNode temp = head;
        DLLNode res = null;
        while(temp!= null){
            res= temp.next;
            temp.next= temp.prev;
            temp.prev= res;
            
            res= temp;
            temp = temp.prev;
            
        }
        return res;
    }
}