//Problem: https://leetcode.com/problems/delete-node-in-a-linked-list/
   class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { 
        val = x; 
      }
  }

class Solution {
    public static void deleteNode(ListNode node) {
      node.val= node.next.val;
      node.next= node.next.next;
 
    }
}