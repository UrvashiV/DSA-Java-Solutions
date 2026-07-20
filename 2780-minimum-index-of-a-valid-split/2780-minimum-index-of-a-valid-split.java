class Solution {
    public int minimumIndex(List<Integer> nums) {
        HashMap<Integer, Integer> left = new HashMap<>();
        HashMap<Integer, Integer> right  = new HashMap<>();

        for(int num : nums){
            right.put(num, right.getOrDefault(num,0)+1);
        }

        for(int i =0; i<nums.size();i++){
            int number= nums.get(i);

            left.put(number, left.getOrDefault(number,0)+1);
            right.put(number, right.getOrDefault(number,0) -1);

            int n1= i+1;
            int n2 = nums.size()-i-1;

            if(left.get(number)>n1/2 && right.get(number) > n2/2) return i;
        }

        return -1;

        
    }
}