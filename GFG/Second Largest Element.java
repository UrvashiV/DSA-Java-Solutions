// Link: https://www.geeksforgeeks.org/problems/second-largest3735/1

// Approach:
// 1. First loop → find the largest element
// 2. Second loop → find the largest element excluding the maximum
// 3. Return the second largest value


// Dry Run:
// Input: [12, 35, 1, 10, 34, 1]

// Step 1: Find largest
// largest = 35

// Step 2: Find second largest (excluding 35)
// Compare remaining elements → 34 is max

// Output: 34


class Solution {
    public int getSecondLargest(int[] arr) {
        int largest = 0;
        int secLargest = -1;
        int n = arr.length;

        // Find largest element
        for (int i = 0; i < n; i++) {
            largest = Math.max(largest, arr[i]);
        }

        // Find second largest element
        for (int i = 0; i < n; i++) {
            if (arr[i] != largest) {
                secLargest = Math.max(secLargest, arr[i]);
            }
        }

        return secLargest;
    }
}
