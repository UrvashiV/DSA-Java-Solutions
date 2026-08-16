class Solution {
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        // code here
        Stack<Integer> stack = new Stack<>();
        ArrayList<Integer> ans = new ArrayList<>();
        int n = arr.length-1;
        
        for(int i=n; i>=0; i--){
            
            while(!stack.empty()  && stack.peek() <= arr[i]){
                stack.pop();
            }
            
            if(stack.empty()){
                ans.add(-1);
            }
            else{
                ans.add(stack.peek());
            }
            
            stack.push(arr[i]);
            
        }
        
        Collections.reverse(ans);
        
        return ans;
    }
}