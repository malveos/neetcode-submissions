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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode nh = null;
        ListNode head = null;
        while (list1!=null && list2!=null) {
            if (list1.val < list2.val) {
                // ListNode cur = new ListNode(list1.val);
                nh = add(nh, list1.val);
                if (head == null) {
                    head = nh;
                }
                list1 = list1.next;
            } else {
                 nh = add(nh, list2.val);
                if (head == null) {
                    head = nh;
                }
                list2 = list2.next;
            }
        }

         while (list1!=null) {
              nh = add(nh, list1.val);
                if (head == null) {
                    head = nh;
                }
                list1 = list1.next;
         }

           while (list2!=null) {
              nh = add(nh, list2.val);
                if (head == null) {
                    head = nh;
                }
                list2 = list2.next;
         }

         return head;
    }

    private ListNode add(ListNode head, int val) {
        if (head == null) {
            head  = new ListNode(val);
            return head;
        }
        head.next = new ListNode(val);
        return head.next;
    }
}