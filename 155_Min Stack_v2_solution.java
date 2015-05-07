class MinStack {
    Stack cur = new Stack();
    Stack min = new Stack();
    public void push(int x) {
        cur.push(x);
        if(min.empty() || ((int)min.peek() >= x)){
            min.push(x);
        }
    }

    public void pop() {
        if((int)cur.pop() == (int)min.peek()){
            min.pop();
        }
    }

    public int top() {
        return (int)cur.peek();
    }

    public int getMin() {
        return (int)min.peek();
    }
    
    
}
