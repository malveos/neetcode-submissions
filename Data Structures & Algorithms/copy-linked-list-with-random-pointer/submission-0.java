/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
       if(head == null) return null;

       Node temp = head;
       // intemediate temp nodes
       while(temp!=null) {
        Node nw = new Node(temp.val);
        nw.next = temp.next;
        temp.next = nw;
        temp = nw.next;
       } 

       Node nH = head.next;
        // copy random pointers
        temp = head;
       while( temp!=null) {
            if (temp.random!=null) {
                temp.next.random = temp.random.next;
            }
            temp = temp.next.next;
       }
       //Remove first copies;
       temp = head;
       Node cpyH = nH;
       while(temp!=null) {
        if (temp.next!=null)
            temp.next = temp.next.next;
        if (cpyH.next!=null)
            cpyH.next = cpyH.next.next;
        temp = temp.next;
        cpyH = cpyH.next;
       } 

       return nH;
    }
}
