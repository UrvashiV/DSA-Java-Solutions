// Link: https://leetcode.com/problems/maximum-subarray/

// Approach:
// Use Kadane’s Algorithm.
// Traverse the array and keep adding elements to current sum.
// Update maximum sum at each step.
// If current sum becomes negative, reset it to 0.


// Dry Run:
// Input: [-2, 1, -3, 4, -1, 2, 1, -5, 4]

// Step 1: sum=-2 → maxi=-2 → reset sum=0
// Step 2: sum=1 → maxi=1
// Step 3: sum=-2 → maxi=1 → reset sum=0
// Step 4: sum=4 → maxi=4
// Step 5: sum=3 → maxi=4
// Step 6: sum=5 → maxi=5
// Step 7: sum=6 → maxi=6
// Step 8: sum=1 → maxi=6
// Step 9: sum=5 → maxi=6

// Output: 6


class Solution {
    public int maxSubArray(int[] nums) {

        int maxi= Integer.MIN_VALUE;
        int sum=0;
        for(int i: nums){
            sum += i;
            maxi= Math.max(sum, maxi);
            if (sum < 0) sum = 0;
        }
        return maxi;
    }
}
