// Link: https://leetcode.com/problems/max-consecutive-ones/

// Approach:
// Traverse the array and count consecutive 1s.
// If the current element is 1, increment counter.
// Update maximum count using Math.max.
// If element is 0, reset counter to 0.


// Dry Run:
// Input: [1, 1, 0, 1, 1, 1]

// Step 1: i=0 → nums[i]=1 → counter=1, maxi=1
// Step 2: i=1 → nums[i]=1 → counter=2, maxi=2
// Step 3: i=2 → nums[i]=0 → counter=0
// Step 4: i=3 → nums[i]=1 → counter=1, maxi=2
// Step 5: i=4 → nums[i]=1 → counter=2, maxi=2
// Step 6: i=5 → nums[i]=1 → counter=3, maxi=3

// Output: 3


class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxi=0;
        int counter=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==1)
            {
                counter++;
                maxi = Math.max(maxi,counter);
            }
            else{
                counter=0;
            }
        }
        return maxi;
    }
}
