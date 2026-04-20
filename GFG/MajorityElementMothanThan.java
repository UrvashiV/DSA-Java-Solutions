// Link:
// https://www.geeksforgeeks.org/problems/majority-vote/1

// Approach:
// - Use Boyer Moore Voting Algorithm.
// - Elements appearing more than n/3 times can be at most 2.
// - So maintain two candidates:
//
//     maj1 with count1
//     maj2 with count2
//
// Step 1: Find possible majority candidates
// - Traverse array:
//     If current element matches maj1 → count1++
//     Else if matches maj2 → count2++
//     Else if count1 == 0 → assign maj1
//     Else if count2 == 0 → assign maj2
//     Else decrement both counts
//
// Step 2: Verification
// - Count actual frequency of maj1 and maj2.
// - Add candidates whose count > n/3.
//
// Step 3:
// - Sort result because answer should be in increasing order.

// Why maximum 2 elements?
// - More than two numbers cannot each appear more than n/3 times.

// Dry Run:
// Input:
// arr = [2, 1, 2, 3, 2, 1, 1]
//
// n = 7
// n/3 = 2
//
// Candidate Selection:
// maj1 = 2
// maj2 = 1
//
// Verification:
// 2 appears 3 times
// 1 appears 3 times
//
// Both counts > 2
//
// Output:
// [1, 2]

// Time Complexity:
// O(n)
// - One pass for candidate selection
// - One pass for verification
// - Sorting result has at most 2 elements → O(1)

// Space Complexity:
// O(1)
// - Extra variables only
// - Output list not counted

import java.util.*;

class Solution {
    public ArrayList<Integer> findMajority(int[] arr) {
        
        int count1 = 0, count2 = 0;
        int maj1 = -1, maj2 = -1;
        
        ArrayList<Integer> result = new ArrayList<>();
        
        // Step 1: Find candidates
        for (int i : arr) {
            
            if (maj1 == i) {
                count1++;
            }
            else if (maj2 == i) {
                count2++;
            }
            else if (count1 == 0) {
                maj1 = i;
                count1++;
            }
            else if (count2 == 0) {
                maj2 = i;
                count2++;
            }
            else {
                count1--;
                count2--;
            }
        }
        
        // Step 2: Verification
        int c1 = 0, c2 = 0;
        int n = arr.length;
        
        for (int i : arr) {
            if (maj1 == i) {
                c1++;
            }
            else if (maj2 == i) {
                c2++;
            }
        }
        
        if (c1 > n / 3) result.add(maj1);
        if (c2 > n / 3) result.add(maj2);
        
        // Step 3: Sort result
        Collections.sort(result);
        
        return result;
    }
}
