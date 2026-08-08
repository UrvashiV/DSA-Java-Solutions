class MyQueue {

    Stack<Integer> input = new Stack<Integer>();
    Stack<Integer> output = new Stack<Integer>();
     int pushEL =-1;

    public MyQueue() {
       
    }
    
    public void push(int x) {

        if(input.empty()){
            pushEL = x;
        }

        input.push(x);
        
    }
    
    public int pop() {
        
        if(output.empty()){
            while(!input.empty()){
                output.push(input.peek());
                input.pop();
            }
        }
        int val = output.peek();
        output.pop();
        return val;

    }
    
    public int peek() {
        
        if(output.empty()){
            return pushEL;
        }
        return output.peek();
    }
    
    public boolean empty() {
        
        return(input.empty() && output.empty()) ? true : false;
        
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */