// Link: https://www.geeksforgeeks.org/problems/max-consecutive-ones-or-zeros/1

// Approach:
// Traverse the array twice.
// First pass: count maximum consecutive 1s.
// Second pass: count maximum consecutive 0s.
// Keep updating the maximum counts.
// Return the maximum of both.


// Dry Run:
// Input: [1, 1, 0, 0, 0, 1, 1]

// First Pass (for 1s):
// i=0 → count1=1, max1=1
// i=1 → count1=2, max1=2
// i=2 → reset count1=0
// i=3 → count1=0
// i=4 → count1=0
// i=5 → count1=1, max1=2
// i=6 → count1=2, max1=2

// Second Pass (for 0s):
// i=0 → count0=0
// i=1 → count0=0
// i=2 → count0=1, max0=1
// i=3 → count0=2, max0=2
// i=4 → count0=3, max0=3
// i=5 → reset count0=0
// i=6 → count0=0

// Final Step:
// max(max0, max1) = max(3, 2) = 3

// Output: 3


class Solution {
    public int maxConsecBits(int[] arr) {
        // code here
        int max0=0;
        int max1=0;
        int count0=0;
        int count1=0;
        int n= arr.length;
        for (int i =0;i<n;i++)
        {
            if (arr[i]==1)
            {
                count1++;
                max1= Math.max(max1,count1);
            }
            else{
                count1=0;
            }
        }
        for (int i =0;i<n;i++)
        {
            if (arr[i]==0)
            {
                count0++;
                max0= Math.max(max0,count0);
            }
            else{
                count0=0;
            }
        }
        
        return Math.max(max0,max1);
    }
}
