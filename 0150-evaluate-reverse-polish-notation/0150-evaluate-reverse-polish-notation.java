class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        HashMap<String, java.util.function.BiFunction<Integer, Integer, Integer>> mp = 
            new HashMap<>();

        mp.put("+", (a, b) -> a + b);
        mp.put("-", (a, b) -> a - b);
        mp.put("*", (a, b) -> a * b);
        mp.put("/", (a, b) -> a / b);


        for(String s : tokens){
            if(s.length() == 1 && 
            (s.charAt(0) == '+' || s.charAt(0) == '-' 
            || s.charAt(0) == '*' || s.charAt(0) == '/')){
                int b = stack.peek();
                stack.pop();

                int a = stack.peek();
                stack.pop();

                int result = mp.get(s).apply(a, b);

                stack.push(result);
            }else{
                int n = Integer.parseInt(s);
                stack.push(n);
            }
        }

        return stack.peek();
    }
}