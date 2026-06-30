class Solution {
    boolean pythagoreanTriplet(int[] arr) {
        // code here
        HashSet<Integer> set = new HashSet<>();
        for(int i: arr){
            set.add(i*i);
        }
        
        for(int i =0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                int sum = arr[i]* arr[i] + arr[j] * arr[j];
                
                if(set.contains(sum))
                return true;
            }
        }
        return false;
    }
}