// Link:
// https://leetcode.com/problems/majority-element-ii/

// Approach:
// - Use Boyer Moore Voting Algorithm.
// - In this problem, elements appearing more than n/3 times can be at most 2.
// - So track two candidates:
//
//     majorOne with count1
//     majorTwo with count2
//
// Step 1: Find possible candidates
// - Traverse array:
//     If current number matches candidate1 → count1++
//     Else if matches candidate2 → count2++
//     Else if count1 == 0 → assign new candidate1
//     Else if count2 == 0 → assign new candidate2
//     Else decrease both counts
//
// Step 2: Verification
// - Count actual frequency of both candidates.
// - Add candidate if frequency > n/3.

// Why maximum 2 elements?
// - Three different numbers cannot each appear more than n/3 times.

// Dry Run:
// Input:
// nums = [3, 2, 3]
//
// Start:
// majorOne=-1, majorTwo=-1
// count1=0, count2=0
//
// i=3:
// count1=0 → majorOne=3, count1=1
//
// i=2:
// count2=0 → majorTwo=2, count2=1
//
// i=3:
// matches majorOne → count1=2
//
// Candidates:
// majorOne=3, majorTwo=2
//
// Verification:
// 3 appears 2 times
// 2 appears 1 time
//
// n=3, n/3=1
//
// 2 > 1 → add 3
// 1 > 1 → false
//
// Output:
// [3]

// Time Complexity:
// O(n)
// - One pass for candidate selection
// - One pass for verification

// Space Complexity:
// O(1)
// - Extra variables only
// - Output list not counted

import java.util.*;

class Solution {
    public List<Integer> majorityElement(int[] nums) {

        int n = nums.length;
        List<Integer> result = new ArrayList<>();

        int count1 = 0;
        int count2 = 0;

        int majorOne = -1;
        int majorTwo = -1;

        // Step 1: Find possible candidates
        for (int i : nums) {

            if (i == majorOne) {
                count1++;
            }
            else if (i == majorTwo) {
                count2++;
            }
            else if (count1 == 0) {
                majorOne = i;
                count1 = 1;
            }
            else if (count2 == 0) {
                majorTwo = i;
                count2 = 1;
            }
            else {
                count1--;
                count2--;
            }
        }

        // Step 2: Verification
        int c1 = 0;
        int c2 = 0;

        for (int i : nums) {
            if (i == majorOne) {
                c1++;
            }
            else if (i == majorTwo) {
                c2++;
            }
        }

        if (c1 > n / 3) result.add(majorOne);
        if (c2 > n / 3) result.add(majorTwo);

        return result;
    }
}
