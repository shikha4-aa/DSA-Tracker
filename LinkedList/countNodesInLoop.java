//Problem Link: https://practice.geeksforgeeks.org/problems/count-the-number-of-nodes-in-a-loop/1
/*
class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
}
*/

class Solution {
    // Function to find the length of a loop in the linked list.
    public int countNodesinLoop(Node head) {
        
        Node slow = head;
        Node fast = head;
        
        while(fast!= null && fast.next!= null){
            slow = slow.next;
            fast = fast.next.next;
            
            if(fast == slow){
               int count = 1;
                while(slow.next!= fast){
                    count++;
                    slow =slow.next;
                }
                return count;
            }
        }
        return 0;
    }
}