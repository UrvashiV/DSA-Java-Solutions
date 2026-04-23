// Link:
// https://www.geeksforgeeks.org/problems/find-missing-and-repeating2512/1

// Approach:
// - Array contains numbers from 1 to n.
// - One number repeats twice.
// - One number is missing.
// - Create a frequency array arr1 of size n + 1.
// - Traverse original array and count occurrences:
//
//     arr1[value]++
//
// - Traverse from 1 to n:
//     If frequency == 2 → repeating number
//     If frequency == 0 → missing number
//
// - Return [repeating, missing].

// Dry Run:
// Input:
// arr = [1, 3, 3]
//
// n = 3
//
// Frequency array after counting:
// index: 0 1 2 3
// value: 0 1 0 2
//
// Traverse 1 to 3:
// i=1 → freq=1
// i=2 → freq=0 → missing = 2
// i=3 → freq=2 → repeating = 3
//
// Output:
// [3, 2]

// Time Complexity:
// O(n)
// - One pass for counting
// - One pass for checking frequency

// Space Complexity:
// O(n)
// - Extra frequency array used

import java.util.*;

class Solution { 
    
    ArrayList<Integer> findTwoElement(int arr[]) {
        
        ArrayList<Integer> result = new ArrayList<>();
        int n = arr.length;
        
        int[] arr1 = new int[n + 1];
        Arrays.fill(arr1, 0);
        
        // Count frequency
        for (int i = 0; i < n; i++) {
            arr1[arr[i]]++;
        }
        
        int repeating = -1;
        int missing = -1;
        
        // Find repeating and missing
        for (int i = 1; i <= n; i++) {
            if (arr1[i] == 2) {
                repeating = i;
            }
            else if (arr1[i] == 0) {
                missing = i;
            }
        }
        
        result.add(repeating);
        result.add(missing);
        
        return result;
    }
}
