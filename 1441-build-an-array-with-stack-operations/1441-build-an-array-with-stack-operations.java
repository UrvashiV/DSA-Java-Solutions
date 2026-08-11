class Solution {
    public List<String> buildArray(int[] target, int n) {

        List<String> ans = new ArrayList<>();
        int stream =1;
        int i=0;

        while(i<target.length && stream <=n){
            ans.add("Push");

            if(stream == target[i]){
                i++;
            }
            else{
                ans.add("Pop");
            }

            stream++;
        }
    return ans;
        
    }
}