// Link: https://leetcode.com/problems/sort-an-array/

// Approach:
// Use built-in Arrays.sort() method to sort the array in ascending order.


// Dry Run:
// Input: [5, 2, 3, 1]

// Step 1: Apply Arrays.sort(nums)
// Step 2: Array becomes [1, 2, 3, 5]

// Output: [1, 2, 3, 5]


import java.util.*;

class Solution {
    public int[] sortArray(int[] nums) {
        Arrays.sort(nums);
        return nums;
    }
}
