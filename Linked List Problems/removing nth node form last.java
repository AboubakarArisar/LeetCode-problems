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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next == null) {
            return null;
        }
        ListNode curr = head;
        int size = 1;
        while(curr.next != null) {
            size++;
            curr = curr.next;
        }
        if(n == size) {
            return head.next;
        }
        int target = size - n;
        ListNode rem = head;
        
        int i = 1;
        while(i < target) {
            i++;
            rem = rem.next;
        }
        rem.next = rem.next.next;
        return head;
    }
}
