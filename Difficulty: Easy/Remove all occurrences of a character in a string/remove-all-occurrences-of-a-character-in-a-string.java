class Solution {
    // Function to remove all occurrences of the character from the string
    public void removeCharacter(StringBuilder s, char c) {
        // code here
        int n= s.length();
        int j=0;
        for(int i=0; i<n ;i++){
            if(s.charAt(i) != c){
                s.setCharAt(j, s.charAt(i));
                j++;
            }
            
        }    
            s.setLength(j);
        
    }
}