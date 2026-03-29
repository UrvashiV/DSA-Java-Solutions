// Link: https://leetcode.com/problems/contains-duplicate/description/

// Approach:
// Use HashSet to track elements.
// If an element is already present in the set, return true.
// Otherwise, add it to the set and continue.


// Dry Run:
// Input: [1, 2, 3, 1]

// Step 1: set = {}
// Step 2: add 1 → set = {1}
// Step 3: add 2 → set = {1, 2}
// Step 4: add 3 → set = {1, 2, 3}
// Step 5: 1 already exists → return true

// Output: true


class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        
        for (int num : nums) {
            if (set.contains(num)) {
                return true; // duplicate found
            }
            set.add(num);
        }
        
        return false; // no duplicates
    }
}
