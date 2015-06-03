/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode t = head;
        if(t == null){
            return head;
        }
        ListNode c = t.next;
        if(c == null){
            return head;
        }
        ListNode h = c.next;
        t.next = null;
        while(h != null){
            c.next = t;
            t = c;
            c = h;
            h = h.next;
        }
        c.next = t;
        return c;
    }
}