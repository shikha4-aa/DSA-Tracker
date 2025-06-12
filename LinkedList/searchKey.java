//Problem: https://practice.geeksforgeeks.org/problems/search-in-linked-list/1
class Solution {
    static boolean searchKey(int n, Node head, int key) {
        // Code here
        Node temp = head;
        
        while(temp!=null){
            if(temp.data== key){
                return true;
            }
            
            temp= temp.next;
            
        }
        return false;
    }
}