// Link: https://leetcode.com/problems/move-zeroes/

// Approach:
// Use two pointers.
// Pointer j tracks position to place next non-zero element.
// Traverse array, and whenever a non-zero is found, swap it with arr[j].
// Increment j to maintain order.


// Dry Run:
// Input: [0, 1, 0, 3, 12]

// Step 1: j = 0

// i = 0 → nums[0] = 0 → skip

// i = 1 → nums[1] = 1 → swap with nums[0]
// Array: [1, 0, 0, 3, 12], j = 1

// i = 2 → nums[2] = 0 → skip

// i = 3 → nums[3] = 3 → swap with nums[1]
// Array: [1, 3, 0, 0, 12], j = 2

// i = 4 → nums[4] = 12 → swap with nums[2]
// Array: [1, 3, 12, 0, 0], j = 3

// Output: [1, 3, 12, 0, 0]


class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;

        int j = 0;

        for (int i = 0; i < n; i++)
        {
            // if current element is non-zero
            if (nums[i] != 0)
            {
                // swap with index j
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;

                // move j forward
                j++;
            }
        }
    }
}
