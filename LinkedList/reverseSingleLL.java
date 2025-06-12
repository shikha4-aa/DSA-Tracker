// Problem Link: https://practice.geeksforgeeks.org/problems/reverse-a-linked-list/1

/* linked list node class:

class Node {
    int data;
    Node next;
    Node(int value) {
        this.value = value;
    }
}

*/

class Solution {
    Node reverseList(Node head) {
        // code here
        Node prev =null;
        
        Node temp = head;
        while(temp!= null){
            Node newNode = temp.next;
            temp.next = prev;
            prev= temp;
            temp= newNode;
        }
        return prev;
    }
}