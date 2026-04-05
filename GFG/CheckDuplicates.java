// Link: https://www.geeksforgeeks.org/problems/check-if-array-contains-duplicates-or-not/1

// Approach:
// Use a HashSet to store elements.
// If the size of the set is smaller than array length,
// it means duplicates exist.



// Dry Run:
// Input: [1, 2, 3, 1]
// Step 1: n = 4
// Step 2: set = {1, 2, 3}
// Step 3: set.size() = 3 < n (4)

// Output: true


import java.util.*;

class Solution {
    public boolean checkDuplicates(int arr[]) {
        int n = arr.length;
        HashSet<Integer> set = new HashSet<>();

        for (int x : arr) {
            set.add(x);
        }

        if (n > set.size()) return true;

        return false;
    }
}
