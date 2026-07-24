class Solution {
    public boolean isPalindrome(String s) {
    String frshStr="";
    s = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
    
    for(int i= s.length()-1;i>=0;i--){
        frshStr = frshStr + s.charAt(i);
    }
    if(s.equals(frshStr)){
        return true;
    }
        
      return false;  
    }
}