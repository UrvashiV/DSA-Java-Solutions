class Solution {
    public int minimumPushes(String word) {
        int n = word.length();
        int result =0 ;
        ArrayList<Integer> map = new ArrayList<>(Collections.nCopies(26,0));

        for(int i =0; i<n; i++){
            int idx = word.charAt(i)-'a';
            map.set(idx, map.get(idx)+1);

        }

        Collections.sort(map, Collections.reverseOrder());
        for(int i=0; i<26; i++){
            int freq = map.get(i);
            int press = (i/8) +1;
            result += freq * press;
        }

        return result;
    }
}