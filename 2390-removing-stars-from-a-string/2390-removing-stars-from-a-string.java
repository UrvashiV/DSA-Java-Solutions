class Solution {
    public String removeStars(String s) {
        String result ="";

        for(char ch : s.toCharArray()){
            if(ch == '*'){
                result = result.substring(0,result.length()-1);
            }
            else{
                result = result + ch;
            }
        }
    return result;

    }
}