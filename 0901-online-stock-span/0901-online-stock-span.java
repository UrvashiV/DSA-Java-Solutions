class StockSpanner {

    Stack<ArrayList<Integer>> stack = new Stack<>();

    public StockSpanner() {
        
    }
    
    public int next(int price) {
        int span=1;
        while(!stack.empty() && stack.peek().get(0) <= price){
            span = span + stack.peek().get(1);
            stack.pop();
        }

        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(price);
        arr.add(span);
        stack.push(arr);

        return span;


    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */