/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode removeElements(ListNode head, int val) {
        while(head != null && head.val == val){
            head = head.next;
        }
        if(head == null){
            return head;
        }
        ListNode h = head;
        ListNode t = head.next;
        while(t != null){
            if(t.val == val){
                h.next = t.next;
                t = t.next;
            }
            else{
                h = t;
                t = t.next;
            }
        }
        return head;
    }
}