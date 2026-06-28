class MinStack {
    private Stack<Integer> st;
    private Stack<Integer> temp;// storing mean while adding

    public MinStack() {
        st = new Stack<>();
        temp = new Stack<>();
    }
    
    public void push(int val) {
        st.push(val);
        if (temp.isEmpty() || temp.peek() >= val) {
            temp.push(val);
        }
    }
    
    public void pop() {
        if (st.isEmpty()) return;
        int cur = st.pop();   
        if(cur == temp.peek())
            temp.pop();
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        return temp.peek();
    }
}
