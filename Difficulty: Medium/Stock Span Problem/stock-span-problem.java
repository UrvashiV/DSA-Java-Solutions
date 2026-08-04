class Solution {
	
	public ArrayList<Integer> calculateSpan(int[] arr) {
		// code here
		Stack<Integer> stack = new Stack<>();
		ArrayList<Integer> ar = new ArrayList<>();
		
		for (int i = 0; i<arr.length; i++) {
			while (!stack.empty() && arr[stack.peek()] <= arr[i]) {
				stack.pop();
			}
			
			int span;
			
			if (stack.empty()) {
				span = i + 1;
			}
			else {
				span = i - stack.peek();
			}
			
			ar.add(span);
			
			stack.push(i);
		}
		
		return ar;
	}
}
