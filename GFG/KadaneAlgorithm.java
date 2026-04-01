// Link: https://www.geeksforgeeks.org/problems/kadanes-algorithm-1587115620/1

// Approach:
// Use Kadane’s Algorithm.
// Traverse the array and keep adding elements to current sum.
// Update maximum sum at each step.
// If current sum becomes negative, reset it to 0.


// Dry Run:
// Input: [-2, -3, 4, -1, -2, 1, 5, -3]

// Step 1: sum=-2 → maxi=-2 → reset sum=0
// Step 2: sum=-3 → maxi=-2 → reset sum=0
// Step 3: sum=4 → maxi=4
// Step 4: sum=3 → maxi=4
// Step 5: sum=1 → maxi=4
// Step 6: sum=2 → maxi=4
// Step 7: sum=7 → maxi=7
// Step 8: sum=4 → maxi=7

// Output: 7


class Solution {
    int maxSubarraySum(int[] arr) {
        // Code here
        int n= arr.length;
        int maxi= Integer.MIN_VALUE, sum = 0;
        for (int i : arr){
            sum += i;
            maxi= Math.max(maxi, sum);
            if(sum < 0) sum = 0;
        }
        return maxi;
    }
}
