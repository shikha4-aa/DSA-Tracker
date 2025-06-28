// LeetCode Problem: https://leetcode.com/problems/linked-list-cycle-ii/
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class detectCycle2{
    public ListNode detectCycle(ListNode head) {
        if(head== null || head.next== null){
            return null;
        }

        ListNode slow = head;
        ListNode fast = head;

        while(fast!= null && fast.next!= null){
            fast = fast.next.next;
            slow = slow.next;

            /*correct logic: First, detect if there is a cycle using Tortoise and Hare.
              If there's a cycle, then:
            1. Keep one pointer at the meeting point.
            2. Move the other to the head.
            3. Move both one step at a time; they meet at the start of the cycle.*/

            if(slow== fast){
               ListNode temp = head;
               while(temp!= slow){
                 temp = temp.next;
                 slow = slow.next;
               }
               return temp;

            }
        }
        return null;
    }
}