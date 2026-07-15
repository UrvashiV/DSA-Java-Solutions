class Solution {
    public int[] queryResults(int limit, int[][] queries) {

        HashMap<Integer, Integer> countColor = new HashMap<>();
        HashMap<Integer, Integer> ballColor = new HashMap<>();
        int[] result = new int[queries.length];

        for(int i = 0; i< queries.length; i++){
          
          int ball = queries[i][0];
          int color = queries[i][1];

          if (ballColor.containsKey(ball)){
            int precolor = ballColor.get(ball);

            countColor.put(precolor, countColor.getOrDefault(precolor,0)-1);
            if(countColor.get(precolor)==0){
                countColor.remove(precolor);
            }
          }

          ballColor.put(ball,color);
          countColor.put(color, countColor.getOrDefault(color,0)+1);
          result[i] = countColor.size();
        }
     return result;
        
    }
}