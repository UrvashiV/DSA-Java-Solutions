class Solution {
    public void rotate(int[] nums, int k) {
           int n = nums.length;
        int r = k%n;
        r= n-r;
        int[] temp = new int[r];

        for (int i =0;i<r;i++){
            temp[i]= nums[i];
        }

        for(int i =r ; i<n;i++){
            nums[i-r]= nums[i];
        }

        for(int i=n-r;i<n;i++){
            nums[i]=temp[i-(n-r)];
        }
    }
}
