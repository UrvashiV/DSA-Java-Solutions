// 🔗 Link:
// https://leetcode.com/problems/rearrange-array-elements-by-sign/

// 🧠 Approach:
// - Create a new array `result` of same size.
// - Use two pointers:
//     pos = 0 → for positive numbers (even indices)
//     neg = 1 → for negative numbers (odd indices)
// - Traverse the array:
//     If element > 0 → place at index `pos`, then pos += 2
//     Else → place at index `neg`, then neg += 2
// - This ensures alternating positive and negative elements.

// 🔍 Dry Run:
// Input: [3, 1, -2, -5, 2, -4]
//
// Step-by-step:
// pos = 0, neg = 1
//
// i=0 → 3  → result[0] = 3  → pos = 2
// i=1 → 1  → result[2] = 1  → pos = 4
// i=2 → -2 → result[1] = -2 → neg = 3
// i=3 → -5 → result[3] = -5 → neg = 5
// i=4 → 2  → result[4] = 2  → pos = 6
// i=5 → -4 → result[5] = -4 → neg = 7
//
// Output: [3, -2, 1, -5, 2, -4]

// ⏱️ Time Complexity:
// O(n) → single traversal of array

// 📦 Space Complexity:
// O(n) → extra array used

import java.util.*;

class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int pos = 0;
        int neg = 1;
        int result[] = new int[n];

        for (int i = 0; i < n; i++) {
            if (nums[i] > 0) {
                result[pos] = nums[i];
                pos += 2;
            } else {
                result[neg] = nums[i];
                neg += 2;
            }
        }

        return result;
    }
}
