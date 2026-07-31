class Solution {
	public boolean isBalanced(String s) {
		// code here
		Stack<Character> stack = new Stack<>();
		
		for (Character ch: s.toCharArray()) {
			if (ch == '{' || ch == '[' || ch == '(') {
				stack.push(ch);
			}
			else {
				
				if (stack.isEmpty()) {
					return false;
				}
				
				Character top = stack.pop();
				
				if ((ch == ')' && top != '(') || (ch == '}' && top != '{') || (ch == ']' && top != '['))
					{
					return false;
				}
				
			}
		}
		
		return stack.isEmpty();
	}
}
