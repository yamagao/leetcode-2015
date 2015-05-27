/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode hi = head, lo = null;
        while(n > 0){
            hi = hi.next;
            n--;
        }
        while(hi != null){
            hi = hi.next;
            if(lo == null) lo = head;
            else lo = lo.next;
        }
        if(lo == null){
            return head.next;
        }
        lo.next = lo.next.next;
        return head;
    }
}