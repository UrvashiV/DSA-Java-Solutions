// Link: https://www.geeksforgeeks.org/problems/check-if-an-array-is-sorted0701/1

// Approach:
// Traverse the array and compare each element with the next one.
// If any element is greater than the next element, the array is not sorted.


// Dry Run:
// Input: [1, 2, 3, 4, 5]

// Step 1: 1 <= 2 → OK
// Step 2: 2 <= 3 → OK
// Step 3: 3 <= 4 → OK
// Step 4: 4 <= 5 → OK

// Output: true


class Solution {
    public boolean isSorted(int[] arr) {
        // code here
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }

        return true;
    }
}
