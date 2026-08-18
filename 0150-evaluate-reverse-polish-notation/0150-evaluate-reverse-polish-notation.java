class Solution {

    public int opera(int a, int b, String s){
        if(s.charAt(0) == '+'){
            return a + b;
        }
        else if(s.charAt(0) == '-'){
            return a - b;
        }
        else if(s.charAt(0) == '*'){
            return a * b;
        }
        
            return a / b;
    }


    public int evalRPN(String[] tokens) {

        Stack<Integer> stack = new Stack<>();

        for(String s: tokens){
            if(s.length()==1 && 
            (s.charAt(0) =='+' || s.charAt(0) =='-' || s.charAt(0) =='*' || s.charAt(0) =='/')){
                int b= stack.peek();
                stack.pop();

                int a = stack.peek();
                stack.pop();

                int result = opera(a, b, s);
                stack.push(result);
            }
            else{
                int n = Integer.parseInt(s);
                stack.push(n);
            }

        }

        return stack.peek();
        
    }
}