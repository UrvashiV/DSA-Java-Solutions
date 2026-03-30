// Link: https://www.geeksforgeeks.org/problems/missing-number-in-array1416/1

// Approach:
// Calculate expected sum of numbers from 1 to n using formula n*(n+1)/2.
// Calculate actual sum of elements in the array.
// The missing number is the difference between expected sum and actual sum.


// Dry Run:
// Input: [1, 2, 4, 5]

// Step 1: n = arr.length + 1 = 5
// Step 2: expected sum = 5 * 6 / 2 = 15

// Step 3: actual sum = 1 + 2 + 4 + 5 = 12

// Step 4: missing number = 15 - 12 = 3

// Output: 3


class Solution {
    int missingNum(int arr[]) {
        long n = arr.length + 1;

        // expected sum of first n numbers
        long sum = n * (n + 1) / 2;

        // sum of array elements
        long sumArr = 0;

        for (int i = 0; i < arr.length; i++)
        {
            sumArr += arr[i];
        }

        // return missing number
        return (int)(sum - sumArr);
    } 
}
