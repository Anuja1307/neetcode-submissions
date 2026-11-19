class MinStack {
    Stack<Long> stack;
    long min;

    public MinStack() {
        stack=new Stack<>();
        min=0l;
        
    }
    
    public void push(int val) {
        if(stack.isEmpty()){
            stack.push(0l);
            min=val;
        }
        else{
            stack.push(val-min);
            if(val<min){
                min=val;
            }
        }
        
    }
    
    public void pop() {
        long n=stack.pop();
        if(n<0){
            min=min-n;
        }
        
    }
    
    public int top() {
        long n=stack.peek();
        if(n<0){
            return (int) min;
        }
        return (int) (n+min);
        
    }
    
    public int getMin() {
        return (int) min;
        
    }
}
