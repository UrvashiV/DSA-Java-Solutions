class Solution {
    public String simplifyPath(String path) {
        String [] arr = path.split("/");
        Stack<String> st = new Stack<>();

        for(String s: arr){
            if(s.equals("") || s.equals(".")) continue;
            if(!s.equals("..")) st.push(s);
            else if(!st.empty()) st.pop();
        }

        if(st.empty()) return "/";

        String result ="";
        while(!st.empty()){
            result = "/" +st.pop()+ result;
        }

        return result;

    }
}