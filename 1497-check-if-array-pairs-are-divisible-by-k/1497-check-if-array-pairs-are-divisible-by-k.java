class Solution {
    public boolean canArrange(int[] num, int k) {
        int[] arr  = new int[k];
        Arrays.fill(arr,0);

        for(int i : num){
            int rem = (i % k + k) % k;
            arr[rem]++;
        }

        if(arr[0]%2 !=0) return false;

        for(int r=1; r<=k/2; r++){
            int remhalf = k-r;
            if(arr[remhalf]!= arr[r]){
                return false;
            }
        }
        return true;
    }
}