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
 import java.lang.Math.*;
class Solution {
    public int getDecimalValue(ListNode head) {
        int count = 0;
        ListNode curr = head;
        while(curr!=null) {
            count++;
            curr = curr.next;
        }
        curr = head;
        int decimal = 0;
        for(int i  = count - 1 ; i >= 0; i--) {
            decimal+= (Math.pow(2,i) * curr.val);
            curr = curr.next;
        }
        return decimal;
    }
}
