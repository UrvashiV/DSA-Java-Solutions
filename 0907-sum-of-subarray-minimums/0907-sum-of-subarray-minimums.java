class Solution {
   
   public int[] getNSL(int[] arr, int n){
    Stack<Integer> stack = new Stack<>();
    int[] ans = new int[n];

    for(int i=0; i<n; i++){
        if(stack.empty()){
            ans[i] = -1;
        }
        else{
            while( !stack.empty() && arr[stack.peek()] >= arr[i]){
                stack.pop();
            }
            ans[i] = stack.empty() ? -1 : stack.peek();
        }

        stack.push(i);
    }
    return ans;
   }


 public int[] getNSR(int[] arr, int n){
    Stack<Integer> stack = new Stack<>();
    int[] ans = new int[n];

    for(int i=n-1; i>=0; i--){
        if(stack.empty()){
            ans[i] = n;
        }
        else{
            while( !stack.empty() && arr[stack.peek()] > arr[i]){
                stack.pop();
            }
            ans[i] = stack.empty() ? n : stack.peek();
        }

        stack.push(i);
    }
    return ans;
   }


    public int sumSubarrayMins(int[] arr) {
        int n = arr.length;
        int[] NSL = new int[n];
        int[] NSR = new int[n];

        NSL= getNSL(arr,n);
        NSR = getNSR(arr,n);

    
        long sum=0;
        long m = (long)(1e9 + 7);

        for(int i=0; i<n; i++){
            long ls= i- NSL[i];
            long rs = NSR[i] - i;

            long totalSubarray = ls * rs;
            long totalSum = totalSubarray * arr[i];

            sum =(sum + totalSum) % m;
        }
        return (int)sum;        
    }
}