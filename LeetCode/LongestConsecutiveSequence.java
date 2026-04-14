// Link:
// https://leetcode.com/problems/longest-consecutive-sequence/

// Approach:
// - Use a HashSet to store all elements for O(1) lookup.
// - Traverse each element in the set:
//     - Check if it is the start of a sequence:
//         If (i - 1) is NOT in set → it is a starting point
//     - From that element, keep checking (i + 1), (i + 2), ...
//       and count the length of the sequence.
// - Track the maximum length found.
// - Return the longest sequence length.

// Dry Run:
// Input: [100, 4, 200, 1, 3, 2]
//
// set = {100, 4, 200, 1, 3, 2}
//
// i=100 → no 99 → start → sequence length = 1
// i=4   → 3 exists → skip
// i=200 → no 199 → start → length = 1
// i=1   → no 0 → start → sequence: 1→2→3→4 → length = 4
//
// longest = 4
//
// Output: 4

// Time Complexity:
// O(n) → each element is processed at most once

// Space Complexity:
// O(n) → HashSet storage

import java.util.*;

class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        
        if (n == 0) return 0;
        
        int longest = 1;
        HashSet<Integer> set = new HashSet<>();
        
        // Store elements in set
        for (int i : nums) {
            set.add(i);
        }
        
        // Find longest sequence
        for (int i : set) {
            // Check if it is starting point
            if (!set.contains(i - 1)) {
                int count = 1;
                int x = i;
                
                while (set.contains(x + 1)) {
                    x++;
                    count++;
                }
                
                longest = Math.max(longest, count);
            }
        }
        
        return longest;
    }
}
