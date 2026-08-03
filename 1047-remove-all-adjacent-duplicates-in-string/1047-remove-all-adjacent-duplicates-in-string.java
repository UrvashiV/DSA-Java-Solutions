class Solution {
    public String removeDuplicates(String s) {
        String result="";
   
        for(char ch : s.toCharArray()){
            if( result.length() > 0 && result.charAt(result.length() - 1) == ch){
                result = result.substring(0,result.length()-1);
            }else{
                
                result = result + ch;
            }

        }
        return result;
    }
}