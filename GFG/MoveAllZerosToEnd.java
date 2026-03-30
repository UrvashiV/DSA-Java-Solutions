// Link: https://www.geeksforgeeks.org/problems/move-all-zeroes-to-end-of-array0751/1

// Approach:
// Find the first zero in the array (index j).
// Traverse the array from j+1.
// Whenever a non-zero element is found, swap it with arr[j].
// Increment j to point to next zero position.


// Dry Run:
// Input: [1, 0, 2, 0, 4, 0]

// Step 1: n = 6
// Step 2: first zero found at index j = 1

// Step 3: Traverse from i = j+1
// i = 2 → arr[2] = 2 → swap with arr[1]
// Array: [1, 2, 0, 0, 4, 0], j = 2

// i = 3 → arr[3] = 0 → skip

// i = 4 → arr[4] = 4 → swap with arr[2]
// Array: [1, 2, 4, 0, 0, 0], j = 3

// i = 5 → arr[5] = 0 → skip

// Output: [1, 2, 4, 0, 0, 0]


class Solution {
    void pushZerosToEnd(int[] arr) {
        int n = arr.length;

        int j = -1;

        // find first zero
        for (int i = 0; i < n; i++)
        {
            if (arr[i] == 0) {
                j = i;
                break;
            }
        }

        // if no zero found
        if (j == -1) return;

        // move non-zero elements forward
        for (int i = j + 1; i < n; i++)
        {
            if (arr[i] != 0)
            {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
    }
}
