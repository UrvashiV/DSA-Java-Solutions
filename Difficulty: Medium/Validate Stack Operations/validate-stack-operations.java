class Solution {
    public boolean validateOp(int[] a, int[] b) {
        // code here
        
        Stack<Integer> stack = new Stack<>();
        int n =a.length;
        int m =b.length;

        int i=0;
        int j=0;

        while(i<n && j<m)
        {
            stack.push(a[i]);
                while(!stack.empty() && stack.peek() == b[j]){
                stack.pop();
                j++;
                }
            i++;
        }

        return stack.empty() ? true: false;
        
    }
}