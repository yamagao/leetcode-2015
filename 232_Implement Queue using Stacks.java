class MyQueue {
    Stack<Integer> rev = new Stack<Integer>();
    Stack<Integer> temp = new Stack<Integer>();
    // Push element x to the back of queue.
    public void push(int x) {
        while(!rev.isEmpty()){
            temp.push(rev.pop());
        }
        rev.push(x);
        while(!temp.isEmpty()){
            rev.push(temp.pop());
        }
    }

    // Removes the element from in front of queue.
    public void pop() {
        rev.pop();
    }

    // Get the front element.
    public int peek() {
        return rev.peek();
    }

    // Return whether the queue is empty.
    public boolean empty() {
        return rev.isEmpty();
    }
}