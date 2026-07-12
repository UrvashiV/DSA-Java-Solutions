class Solution {
    public int numRabbits(int[] answers) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int totalRabbits=0;

        for(int i: answers){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            int grpSize = entry.getKey()+1;
            int count = entry.getValue();
            int grp = (int)Math.ceil((double)count / grpSize) ;
            int rabbits= grpSize* grp;
            totalRabbits += rabbits;
        }
        return totalRabbits;
    }
}