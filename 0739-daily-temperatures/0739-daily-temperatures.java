class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stack = new Stack<>();
        int n = temperatures.length;
        int[] result = new int[n];

        for(int i=n-1; i>=0; i--){
            while(!stack.empty() && temperatures[i] >= temperatures[stack.peek()])
            stack.pop();

            if(stack.empty()){
                result[i] = 0;
            }
            else{
                result[i] = stack.peek()-i;
            }

            stack.push(i);
        }
        return result;
    }
}