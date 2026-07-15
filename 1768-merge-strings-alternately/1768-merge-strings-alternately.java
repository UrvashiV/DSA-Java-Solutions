class Solution {
    public String mergeAlternately(String word1, String word2) {
        int p1= word1.length();
        int p2= word2.length();
        String output = "";
        int i=0, j=0;

        while(i<p1 && j< p2){
            output = output + word1.charAt(i) +  word2.charAt(j);
            i++;
            j++;
        }

        while(i<p1){
            output =output +  word1.charAt(i);
            i++;
        
        }

        while(j< p2){
            output = output +  word2.charAt(j);
            j++;
        }

        return output;
    }
}