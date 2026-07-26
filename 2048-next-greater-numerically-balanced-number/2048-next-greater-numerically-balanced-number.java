class Solution {

    public boolean Balance(int n){
        int[] arr = new int[10];
        Arrays.fill(arr,0);

        while(n>0){
            int digit = n%10;
            arr[digit]++;
            n= n/10;
        }
        for(int i=0; i<arr.length; i++){
            if(arr[i]>0 && arr[i] != i){
                return false;
            }
            
        }
        return true;
    }


    public int nextBeautifulNumber(int n) {
        
        int largestNumber= 1224444;
        for(int x=n+1; x<=1224444;x++){
            if(Balance(x))
                return x;
        }

    return -1;
    }
}