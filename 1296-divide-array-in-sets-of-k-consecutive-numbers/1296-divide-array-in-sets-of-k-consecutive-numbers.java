class Solution {
    public boolean isPossibleDivide(int[] nums, int k) {
        
        int n = nums.length;
        TreeMap<Integer,Integer> map = new TreeMap<>();

        if(n % k != 0) return false;

        for(int i : nums){
            map.put(i, map.getOrDefault(i,0)+1);
        }

        while(!map.isEmpty()){
            int first = map.firstKey();

            for(int i=0 ;i<k;i++){
                int curr = first +i;
                if(!map.containsKey(curr)) return false;

                map.put(curr,map.get(curr)-1);

                if(map.get(curr)==0){
                    map.remove(curr);
                }
            }

        }

        return true;
    }
}