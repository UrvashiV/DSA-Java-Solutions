// Link: https://www.geeksforgeeks.org/problems/largest-element-in-array4009/1

// Approach:
// Traverse the array and keep track of the maximum element.
// Compare each element with current result using Math.max.


// Dry Run:
// Input: [1, 8, 7, 56, 90]

// Step 1: result = 1
// Step 2: compare with 8 → result = 8
// Step 3: compare with 7 → result = 8
// Step 4: compare with 56 → result = 56
// Step 5: compare with 90 → result = 90

// Output: 90


class Solution {
    public static int largest(int[] arr) {
        // code here
        int result = arr[0];
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            result = Math.max(result, arr[i]);
        }

        return result;
    }
}
