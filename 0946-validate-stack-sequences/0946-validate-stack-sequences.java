class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {

        Stack<Integer> stack = new Stack<>();
        int n =pushed.length;
        int m =popped.length;

        int i=0;
        int j=0;

        while(i<n && j<m)
        {
            stack.push(pushed[i]);
                while(!stack.empty() && stack.peek() == popped[j]){
                stack.pop();
                j++;
                }
            i++;
        }

        return stack.empty() ? true: false;
        
    }
}