// Link:
// https://leetcode.com/problems/missing-number/

// Approach:
// - Array contains n distinct numbers in range [0, n].
// - Exactly one number is missing.
// - Use formula for sum of first n natural numbers:
//
//     sum = n * (n + 1) / 2
//
// - Calculate actual sum of array elements.
// - Missing number = expected sum - actual sum.
//
// Why long is used:
// - To avoid integer overflow for large n while calculating formula.

// Dry Run:
// Input:
// nums = [3, 0, 1]
//
// n = 3
//
// Expected sum:
// 3 * 4 / 2 = 6
//
// Actual sum:
// 3 + 0 + 1 = 4
//
// Missing number:
// 6 - 4 = 2
//
// Output:
// 2

// Time Complexity:
// O(n)
// - One traversal of array

// Space Complexity:
// O(1)
// - Constant extra space

import java.util.*;

class Solution {
    public int missingNumber(int[] nums) {
        
        long n = nums.length;
        
        long sum = n * (n + 1) / 2;
        long sumArr = 0;
        
        for (int i = 0; i < nums.length; i++) {
            sumArr += nums[i];
        }
        
        return (int)(sum - sumArr);
    }
}
