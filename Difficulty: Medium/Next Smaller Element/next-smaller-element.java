class Solution {
    static ArrayList<Integer> nextSmallerEle(int[] arr) {
        // code here
        Stack<Integer> stack = new Stack<>();
        ArrayList<Integer> ans = new ArrayList<>();
        int n= arr.length;
        
        for(int i=n-1; i>=0; i--){
            
            while(!stack.empty() && stack.peek() >= arr[i]){
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