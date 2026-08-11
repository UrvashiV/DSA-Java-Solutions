class Solution {
    public List<String> buildArray(int[] target, int n) {

        List<String> ans = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        int stream =1;
        int i=0;

        while(i<target.length && stream <=n){
            stack.push(stream);
            ans.add("Push");

            if(stream == target[i]){
                i++;
            }
            else{
                stack.pop();
                ans.add("Pop");
            }

            stream++;
        }
    return ans;
        
    }
}