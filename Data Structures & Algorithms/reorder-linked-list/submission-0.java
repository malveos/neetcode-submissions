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
    public void reorderList(ListNode head) {
        if (head == null || head.next ==null) return;
        
        ListNode fast = head.next, slow = head;
        while(fast!=null && fast.next !=null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode shalf = slow.next;
        slow.next = null;

        shalf = reverse(shalf);
        ListNode fhalf = head;
        while(shalf != null) {
            ListNode f= fhalf.next;
            ListNode s = shalf.next;

            fhalf.next = shalf;
            shalf.next = f;
            fhalf = f;
            shalf = s;
        }
    }

    private ListNode reverse(ListNode hd) {
        ListNode prev = null;
        while(hd!=null) {
            ListNode tmp = hd.next;
            hd.next = prev;
            prev = hd;
            hd = tmp;
        }
        return prev;
    }
}
