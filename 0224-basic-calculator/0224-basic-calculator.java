class Solution {
    public int calculate(String s) {

        Stack<Integer> stack = new Stack<>();
        int result =0;
        int number=0;
        int sign =1;

        for(int i=0; i<s.length(); i++){
            if(Character.isDigit(s.charAt(i))){
                number= (number * 10) + (s.charAt(i) - '0');
            }
            else if(s.charAt(i) == '+'){
                result += number * sign;
                number=0;
                sign=1;
            }
            else if(s.charAt(i) == '-'){
                result += number * sign;
                number=0;
                sign=-1;
            }
            else if(s.charAt(i) == '('){
                stack.push(result);
                stack.push(sign);
                result=0;
                number=0;
                sign =1;
            }
            else if(s.charAt(i) == ')'){
                result += number * sign;
                number=0;
                int stack_sign = stack.peek();
                stack.pop();

                int last_result = stack.peek();
                stack.pop();

                result = result* stack_sign;
                result += last_result;
            }

        }
        result = result + (number * sign);
        return result;
        
    }
}