class Solution {
    public String removeStars(String s) {
        Stack<Character> stack = new Stack<>();

        for(char ch: s.toCharArray()){
            if(ch != '*'){
                stack.push(ch);
            }
            if(ch == '*'){
                stack.pop();
            }
        }


        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }
        
        return sb.reverse().toString();
        
    }
}