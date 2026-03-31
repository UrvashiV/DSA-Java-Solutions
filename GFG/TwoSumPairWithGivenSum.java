// Link: https://www.geeksforgeeks.org/problems/key-pair5616/1

// Approach:
// Use a HashSet to store visited elements.
// For each element, calculate (target - element).
// If the complement exists in the set, return true.
// Otherwise, add the element to the set and continue.


// Dry Run:
// Input: arr = [1, 4, 45, 6, 10, 8], target = 16

// Step 1: set = {}
// Step 2: i = 1 → complement = 15 → not in set → add 1 → set = {1}
// Step 3: i = 4 → complement = 12 → not in set → add 4 → set = {1, 4}
// Step 4: i = 45 → complement = -29 → not in set → add 45 → set = {1, 4, 45}
// Step 5: i = 6 → complement = 10 → not in set → add 6 → set = {1, 4, 45, 6}
// Step 6: i = 10 → complement = 6 → found in set

// Output: true


import java.util.*;

class Solution {
    boolean twoSum(int arr[], int target) {
        // code here
        HashSet<Integer> set = new HashSet<>();
        for(int i: arr){
            int a = target - i;
            if(set.contains(a)){
                return true;
            }
            set.add(i);
        }
        return false;
    }
}
