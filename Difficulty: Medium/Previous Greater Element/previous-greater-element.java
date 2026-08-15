class Solution {
     public ArrayList<Integer> preGreaterEle(int[] arr) {
         // code here
       Stack<Integer> stack = new Stack<>();
       ArrayList<Integer> ans = new ArrayList<>();


       for(int i: arr){

           while(!stack.empty() && stack.peek() <= i ) {
               stack.pop();
           }

           if(stack.empty()){
               ans.add(-1);
           }
           else{
               ans.add(stack.peek());
           }

           stack.push(i);
       }

       return ans;
     }
 }