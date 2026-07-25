class Solution {
    public int subarrayBitwiseORs(int[] arr) {
        HashSet<Integer> result = new HashSet<>();

        HashSet<Integer> prev = new HashSet<>();
        for (int i : arr) {
            HashSet<Integer> curr = new HashSet<>();
            curr.add(i);

            for (int value : prev) {

                curr.add(value | i);
            }
            result.addAll(curr);
            prev = curr;
        }
        return result.size();

    }
}

