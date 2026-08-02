class Solution {
    public String removeStars(String s) {
        int n = s.length();
        char[] temp = new char[n];
        int j=0;
        for(int i=0; i<n ;i++){
            if(s.charAt(i) == '*'){
                j--;
                if(j<0) j=0;
            }
            else{
                temp[j] = s.charAt(i);
                j++;
            }
        }

        String result="";
        for(int k=0; k<j; k++){
            result = result + temp[k];
        }

        return result;

    }
}