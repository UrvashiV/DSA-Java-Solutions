class Solution {
	
	public ArrayList<Integer> calculateSpan(int[] arr) {
		// code here
		Stack<ArrayList<Integer>> stack = new Stack<>();
		ArrayList<Integer> result = new ArrayList<>();
		
		for (int i : arr) {
			
			int span = 1;
			while (!stack.empty() && stack.peek().get(0) <= i) {
				span = span + stack.peek().get(1);
				stack.pop();
			}
			
			ArrayList<Integer> ar = new ArrayList<>();
			ar.add(i);
			ar.add(span);
			stack.push(ar);
			result.add(span);
			
		}
		
		return result;
	}
}
