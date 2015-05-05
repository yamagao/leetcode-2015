class MinStack {
    ListNode head;
    public void push(int x) {
        if(head == null || x < head.min){
            head = new ListNode(x, x, head);
        }
        else{
            head = new ListNode(x, head.min, head);
        }
    }

    public void pop() {
        if(head != null){
            head = head.next;
        }
    }

    public int top() {
        return head.val;
    }

    public int getMin() {
        return head.min;
    }
}
class ListNode {
    int val;
    int min;
    ListNode next;
    ListNode(int x, int y, ListNode n) { val = x; min = y; next = n;}
}
