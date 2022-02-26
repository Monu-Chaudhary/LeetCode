class MinStack {
    ArrayList<Integer> arr = new ArrayList<>();
    ArrayList<Integer> minStack = new ArrayList<>();
    int size;
    public MinStack() {
        size = 0;
    }
    
    public void push(int val) {
        arr.add(val);
        if (size == 0) {
            minStack.add(val);
        }
        else if (minStack.get(size-1) > val) minStack.add(val);
        else {
            minStack.add(minStack.get(size-1));
        }
        size++;
    }
    
    public void pop() {
        if (size == 0) return;
        arr.remove(size -1);
        minStack.remove(size-1);
        size--;
    }
    
    public int top() {
        if (size == 0) return -1;
        return arr.get(size-1);
    }
    
    public int getMin() {
        if (size == 0) return -1;
        return minStack.get(size-1);
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */