class Solution {
    public String minRemoveToMakeValid(String s) {
        int n = s.length();

        Stack<Integer> stack = new Stack<>();
        HashSet<Integer> set = new HashSet<>();

        for(int i=0; i<n; i++){
            if(s.charAt(i) == '('){
                stack.push(i);
            }
            else if(s.charAt(i) == ')'){
                if(!stack.empty()) stack.pop();
                else set.add(i);
            }
        }

        while(!stack.empty()){
            set.add(stack.peek());
            stack.pop();
        }

        String  result ="";
        for(int i =0; i<n; i++){
            if(set.contains(i)) continue;
            result= result + s.charAt(i);
        }

        return result;
        
    }
}
