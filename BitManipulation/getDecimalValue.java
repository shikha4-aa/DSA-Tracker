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
class Solution {
    public int getDecimalValue(ListNode head) {
        int n = 0;

        while(head!= null){
            n = n<<1 | head.val;
            head= head.next;
        }

        return n;
    }
}

//Link: https://leetcode.com/problems/convert-binary-number-in-a-linked-list-to-integer/
//Problem: Convert a binary number represented as a linked list to its decimal value.