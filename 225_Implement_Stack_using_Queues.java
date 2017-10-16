class MyStack {

    /** Initialize your data structure here. */
    private Queue<Integer> Q = new LinkedList<>();
    public MyStack() {
        
    }
    
    /** Push element x onto stack. */
    public void push(int x) {
        Q.offer(x);
        for(int i=1;i<Q.size();i++)
            Q.offer(Q.remove());
    }
    
    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        return Q.remove();
    }
    
    /** Get the top element. */
    public int top() {
        return Q.peek();
    }
    
    /** Returns whether the stack is empty. */
    public boolean empty() {
        return Q.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */