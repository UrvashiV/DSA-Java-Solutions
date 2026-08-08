class myQueue {

    // Initialize your data members
    
     Stack<Integer> input = new Stack<Integer>();
     Stack<Integer> output = new Stack<Integer>();
     int pushEL =-1;

    void enqueue(int x) {
        // Implement enqueue operation
         if(input.empty()){
            pushEL = x;
        }

        input.push(x);
    }

    void dequeue() {
        // Implement dequeue operation
        if(output.empty()){
            while(!input.empty()){
                output.push(input.peek());
                input.pop();
            }
        }
        
        output.pop();
        
    }

    int front() {
        // Implement front operation
        
        if(input.empty() && output.empty()){
            return -1;
        }
        
        if(output.empty()){
            return pushEL;
        }
        
        
        return output.peek();
    }

    int size() {
        // Implement size operation
        return(input.size() + output.size());
    }
}
