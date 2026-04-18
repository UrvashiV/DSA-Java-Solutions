// Link:
// https://www.geeksforgeeks.org/problems/merge-all-subarrays-into-a-sorted-array/1

// Approach:
// - Create an ArrayList named result.
// - Traverse the 2D array row by row.
// - Add every element into result.
// - After collecting all elements, sort the result list.
// - Return the sorted merged array.

// Dry Run:
// Input:
// mat = [
//   [3, 1],
//   [2, 4]
// ]
//
// Step 1: Traverse matrix
// result = [3, 1, 2, 4]
//
// Step 2: Sort result
// result = [1, 2, 3, 4]
//
// Output:
// [1, 2, 3, 4]

// Time Complexity:
// O(r * c) for traversal
// O((r*c) log(r*c)) for sorting
// Total: O((r*c) log(r*c))
//
// where:
// r = number of rows
// c = number of columns

// Space Complexity:
// O(r * c)
// - Stores all matrix elements in ArrayList

import java.util.*;

class Solution {
    public ArrayList<Integer> mergeArrays(int[][] mat) {
        
        ArrayList<Integer> result = new ArrayList<>();
        
        // Add all elements into result
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                result.add(mat[i][j]);
            }
        }
        
        // Sort merged elements
        Collections.sort(result);
        
        return result;
    }
}
