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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ans = new ListNode(0);
        ListNode pre =ans;
        int carry =0;
        while (l1 !=null || l2 != null) {
            int v1 = l1!= null ? l1.val: 0;
            int v2 = l2!=null ? l2.val : 0;
            int sm = v1 + v2 +carry;
            carry = sm/10;
            ListNode nd = new ListNode(sm%10);
            pre.next = nd;
            pre = nd;

            l1 = l1 != null ? l1.next : null;
            l2 = l2 != null ? l2.next : null;
        }
        if (carry == 1)
            pre.next = new ListNode(1);
        return ans.next;
    }
}
