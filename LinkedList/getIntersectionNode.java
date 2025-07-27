/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class getIntersectionNode {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
         if(headA== null || headB == null) return null;
       while(headA!= null){
         ListNode tempB= headB;

           while(tempB!= null){
            if(headA== tempB) return headA;

            tempB= tempB.next;
           }

           headA= headA.next;
       }
   return null;
    }
}

// Link: https://leetcode.com/problems/intersection-of-two-linked-lists/