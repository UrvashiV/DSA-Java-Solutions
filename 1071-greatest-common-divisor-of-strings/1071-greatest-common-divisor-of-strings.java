class Solution {

    public int gcd(int a, int b){
         while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public String gcdOfStrings(String str1, String str2) {
        //find Edge cases
        String temp1 = str1 + str2;
        String temp2 = str2 + str1;

        if(!temp1.equals(temp2)){
            return "";
        }
        //find GCD length STR1 and STR2

        int l1 = str1.length();
        int l2 = str2.length();

        int gcd = gcd(l1, l2);


        //create a string with GCD length, take any str1 or 2
        String output = "";
        for(int i=0; i<gcd;i++){
            output = output + str1.charAt(i);
        }

        //return 
        return output;
    }
}