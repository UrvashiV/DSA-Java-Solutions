// Link:
// https://www.geeksforgeeks.org/problems/leaders-in-an-array-1587115620/1

// Approach:
// - Traverse the array from right to left.
// - Keep track of the maximum element seen so far (maxi).
// - The last element is always a leader.
// - For each element:
//     If arr[i] >= maxi:
//         - It is a leader → add to result
//         - Update maxi
// - Since we traverse from right to left, reverse the result at the end.

// Dry Run:
// Input: [16, 17, 4, 3, 5, 2]
//
// Step-by-step:
// Start from right:
// maxi = 2 → add 2
//
// i=4 → 5 >= 2 → add 5 → maxi = 5
// i=3 → 3 < 5 → skip
// i=2 → 4 < 5 → skip
// i=1 → 17 >= 5 → add 17 → maxi = 17
// i=0 → 16 < 17 → skip
//
// result (before reverse): [2, 5, 17]
// result (after reverse): [17, 5, 2]

// Time Complexity:
// O(n) → single traversal + reverse

// Space Complexity:
// O(n) → result list

import java.util.*;

class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        
        int n = arr.length;
        ArrayList<Integer> result = new ArrayList<>();
        
        int maxi = arr[n - 1];
        
        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] >= maxi) {
                result.add(arr[i]);
                maxi = arr[i];
            }
        }
        
        Collections.reverse(result);
        return result;
    }
}
