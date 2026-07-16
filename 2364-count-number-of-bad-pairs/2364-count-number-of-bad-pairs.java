class Solution {
    public long countBadPairs(int[] nums) {
        int n = nums.length;
        long count=0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<n;i++){
            nums[i] = nums[i] -i;
        }
        map.put(nums[0],1);

        for(int j=1; j<n ;j++){
            int countBeforeJ = j;
            int countOfJ = map.getOrDefault(nums[j],0);
            int badPair = countBeforeJ- countOfJ;

            count = count+ badPair;
            map.put(nums[j],map.getOrDefault(nums[j],0)+1);
        }
        return count;
    }
}