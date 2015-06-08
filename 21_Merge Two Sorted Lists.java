/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode cur1 = l1, cur2 = l2;
        ListNode cur = null;
        ListNode head = null;
        if(cur1 != null && cur2 != null){
            if(cur1.val < cur2.val){
                head = cur1;
                cur = cur1;
                cur1 = cur1.next;
            }
            else{
                head = cur2;
                cur = cur2;
                cur2 = cur2.next;
            }
        }
        else if(cur1 == null){
            return cur2;
        }
        else if(cur2 == null){
            return cur1;
        }
        while(cur1 != null && cur2 != null){
            if(cur1.val < cur2.val){
                cur.next = cur1;
                cur1 = cur1.next;
            }
            else{
                cur.next = cur2;
                cur2 = cur2.next;
            }
            cur = cur.next;
        }
        if(cur1 == null){
            cur.next = cur2;
        }
        if(cur2 == null){
            cur.next = cur1;
        }
        return head;
    }
}