// Link: https://www.geeksforgeeks.org/problems/rotate-array-by-n-elements-1587115621/1

// Approach:
// Calculate effective rotations using k = d % n.
// Store first k elements in a temporary array.
// Shift remaining elements to the left.
// Copy temp elements back to the end of array.


// Dry Run:
// Input: arr = [1, 2, 3, 4, 5], d = 2

// Step 1: n = 5
// Step 2: k = d % n = 2

// Step 3: temp = [1, 2]

// Step 4: Shift elements:
// i = 2 → arr[0] = 3
// i = 3 → arr[1] = 4
// i = 4 → arr[2] = 5
// Array becomes: [3, 4, 5, 4, 5]

// Step 5: Place temp elements:
// arr[3] = 1
// arr[4] = 2

// Output: [3, 4, 5, 1, 2]


class Solution {
    static void rotateArr(int arr[], int d) {
        int n = arr.length;
        int k = d % n;
        
        int[] temp = new int[k];

        // copy first k elements into temp array
        for (int i = 0; i < k; i++)
        {
            temp[i] = arr[i];
        }
        
        // shift remaining elements to the left
        for (int i = k; i < n; i++)
        {
            arr[i - k] = arr[i];
        }
        
        // copy temp elements back to array
        for (int i = n - k; i < n; i++)
        {
            arr[i] = temp[i - (n - k)];
        }
    }
}
