class Solution {
    public boolean canPair(List<Integer> arr, int k) {
        // code here.
        
        
        int[] num = new int[k];
        Arrays.fill(num,0);
        
        for (int i: arr){
            int rem = (i% k+ k )% k;
            num[rem]++;
        }
        
        if (num[0]% 2!= 0) return false;
        
        for(int r=1; r<=k/2; r++){
            int rhalf = k-r;
            if(num[rhalf] != num[r]){
                return false;
            }
        }
        return true;
    }
}
