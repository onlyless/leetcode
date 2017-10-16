class MinStack {

    private LinkedList<Integer> list = new LinkedList<>();
    private int min = Integer.MAX_VALUE;
    /** initialize your data structure here. */
    public MinStack() {
        
    }
    
    public void push(int x) {
        if(x<=min){
            list.offer(min);
            min = x;
        }
        list.offer(x);
    }
    
    public void pop() {
        if(min==list.pollLast())
            min = list.pollLast();
    }
    
    public int top() {
        return list.getLast();
    }
    
    public int getMin() {
        return min;
        
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */