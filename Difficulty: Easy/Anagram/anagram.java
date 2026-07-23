class Solution {
    public static boolean areAnagrams(String s1, String s2) {
        // code here
        if(s1.length() != s2.length()) 
        return false;
        
        HashMap <Character, Integer> map= new HashMap<>();
        for(char c: s1.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        
        for(char c: s2.toCharArray()){
            if(map.getOrDefault(c,0)>0){
                map.put(c,map.getOrDefault(c,0)-1);
                if(map.get(c)== 0)
                 map.remove(c);
            }
            
        }
        return map.size()==0;
        
    }
}