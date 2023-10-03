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
    public ListNode reverseList(ListNode head) {
           ListNode prev = null;
        ListNode current = head;

        while (current != null)
        {
            // Store next node
            ListNode next = current.next;
            // Reverse current node's pointer
            current.next = prev;
            // Update pointers
            prev = current;
            current = next;
        }

        return prev;
    }
    }
