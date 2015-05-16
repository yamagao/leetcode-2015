/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int count1 = 0;
        int count2 = 0;
        ListNode a = headA;
        ListNode b = headB;
        while(a != null){
            count1++;
            a = a.next;
        }
        while(b != null){
            count2++;
            b = b.next;
        }
        a = headA;
        b = headB;
        if(count1 > count2){
            while(count1 - count2 > 0){
                a = a.next;
                count1--;
            }
        }
        else{
            while(count2 - count1 > 0){
                b = b.next;
                count2--;
            }
        }
        while(count1 > 0){
            if(a != null && a == b){
                return a;
            }
            a = a.next;
            b = b.next;
            count1--;
        }
        return null;
    }
}
