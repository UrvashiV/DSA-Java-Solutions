// Link:
// https://www.geeksforgeeks.org/problems/longest-consecutive-subsequence2449/1

// Approach:
// - First sort the array.
// - Initialize two variables:
//     count → to track current consecutive sequence length
//     longest → to store maximum length found
// - Traverse the array:
//     If current element equals next element → skip (duplicate)
//     Else if current + 1 == next → increase count
//     Else → reset count to 1
// - Update longest at each step
// - Return longest

// Dry Run:
// Input: [1, 9, 3, 10, 4, 20, 2]
//
// After sorting: [1, 2, 3, 4, 9, 10, 20]
//
// Step-by-step:
// i=0 → 1→2 → consecutive → count=2
// i=1 → 2→3 → count=3
// i=2 → 3→4 → count=4
// i=3 → 4→9 → break → count=1
// i=4 → 9→10 → count=2
// i=5 → 10→20 → break → count=1
//
// longest = 4
//
// Output: 4

// Time Complexity:
// O(n log n) → due to sorting

// Space Complexity:
// O(1) → no extra space used (ignoring sorting space)

import java.util.*;

class Solution {

    // Function to return length of longest subsequence of consecutive integers.
    public int longestConsecutive(int[] arr) {
        
        int n = arr.length;
        if (n == 0) return 0;
        
        Arrays.sort(arr);
        
        int longest = 1;
        int count = 1;
        
        for (int i = 0; i < n - 1; i++) {
            int x = arr[i];
            
            if (x == arr[i + 1]) {
                continue;
            }
            else if (x + 1 == arr[i + 1]) {
                count++;
            }
            else {
                count = 1;
            }
            
            longest = Math.max(longest, count);
        }
        
        return longest;
    }
}
