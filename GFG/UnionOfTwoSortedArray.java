// Link:
// https://www.geeksforgeeks.org/problems/union-of-two-sorted-arrays-1587115621/1

// Approach:
// - Use two pointers i and j to traverse both sorted arrays.
// - Compare elements of both arrays:
//     If a[i] <= b[j]:
//         - Add a[i] to result if it is not duplicate
//         - Move i forward
//     Else:
//         - Add b[j] to result if it is not duplicate
//         - Move j forward
// - After one array is exhausted, add remaining elements of the other array
//   while avoiding duplicates.
// - To avoid duplicates, compare with the last inserted element in result.

// Dry Run:
// Input:
// a = [1, 2, 2, 3]
// b = [2, 3, 4]
//
// Step-by-step:
// i=0, j=0 → a[0]=1 < b[0]=2 → add 1
// i=1, j=0 → a[1]=2 == b[0]=2 → add 2 (once), i++
// i=2, j=0 → a[2]=2 == b[0]=2 → skip duplicate, i++
// i=3, j=0 → a[3]=3 > b[0]=2 → add 2 (already exists, skip), j++
// i=3, j=1 → a[3]=3 == b[1]=3 → add 3, i++
// i=4 → remaining b:
// add 4
//
// Output: [1, 2, 3, 4]

// Time Complexity:
// O(n + m) → traverse both arrays once

// Space Complexity:
// O(n + m) → result array

import java.util.*;

class Solution {
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        
        ArrayList<Integer> result = new ArrayList<>();
        int i = 0, j = 0;
        int n = a.length;
        int m = b.length;
        
        while (i < n && j < m) {
            if (a[i] <= b[j]) {
                if (result.size() == 0 || result.get(result.size() - 1) != a[i]) {
                    result.add(a[i]);
                }
                i++;
            } else {
                if (result.size() == 0 || result.get(result.size() - 1) != b[j]) {
                    result.add(b[j]);
                }
                j++;
            }
        }
        
        while (i < n) {
            if (result.size() == 0 || result.get(result.size() - 1) != a[i]) {
                result.add(a[i]);
            }
            i++;
        }
        
        while (j < m) {
            if (result.size() == 0 || result.get(result.size() - 1) != b[j]) {
                result.add(b[j]);
            }
            j++;
        }
        
        return result;
    }
}
