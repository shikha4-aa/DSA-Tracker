/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

 //Problem link: https://leetcode.com/problems/middle-of-the-linked-list/
class Solution {
    public ListNode middleNode(ListNode head) {

//          ListNode temp = head;
//            int len = 0;
//            while(temp!= null){
//             len++;
//             temp= temp.next;
//            }
//            int mid = len/2;
//            temp = head;
//         for(int i = 0; i<mid; i++){
//              temp = temp.next;
//         }
//    return temp;

//optimal and more efficient 
       ListNode slow = head;
       ListNode fast = head;

       while(fast!= null && fast.next!= null){
        fast = fast.next.next;
        slow= slow.next;
        
       }

return slow;
          
    }
}