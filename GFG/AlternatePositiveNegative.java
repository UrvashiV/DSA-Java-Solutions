// Link:
// https://www.geeksforgeeks.org/problems/array-of-alternate-ve-and-ve-nos1401/1

// Approach:
// - Separate all positive and negative elements into two lists:
//     pos → stores positive elements
//     neg → stores negative elements
// - Compare sizes of both lists:
//     Case 1: pos.size() > neg.size()
//         - Fill array alternately using both lists until neg is exhausted
//         - Then add remaining positive elements at the end
//     Case 2: neg.size() >= pos.size()
//         - Fill array alternately until pos is exhausted
//         - Then add remaining negative elements at the end
// - Use arr.set(index, value) to modify original ArrayList

// Dry Run:
// Input: [1, 2, 3, -4, -1, 4]
//
// pos = [1, 2, 3, 4]
// neg = [-4, -1]
//
// Since pos.size() > neg.size():
//
// Step 1 (alternate fill):
// i=0 → arr[0]=1, arr[1]=-4
// i=1 → arr[2]=2, arr[3]=-1
//
// Step 2 (remaining positives):
// index = 2 * neg.size() = 4
// arr[4] = 3
// arr[5] = 4
//
// Output: [1, -4, 2, -1, 3, 4]

// Time Complexity:
// O(n) → one pass to separate + one pass to rearrange

// Space Complexity:
// O(n) → extra space for pos and neg lists

import java.util.*;

class Solution {
    void rearrange(ArrayList<Integer> arr) {
        
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();
        
        // Separate positive and negative elements
        for (int i : arr) {
            if (i < 0) {
                neg.add(i);
            } else {
                pos.add(i);
            }
        }
        
        // Case 1: More positive elements
        if (pos.size() > neg.size()) {
            for (int i = 0; i < neg.size(); i++) {
                arr.set(2 * i, pos.get(i));
                arr.set(2 * i + 1, neg.get(i));
            }
            
            int index = 2 * neg.size();
            for (int i = neg.size(); i < pos.size(); i++) {
                arr.set(index, pos.get(i));
                index++;
            }
        }
        // Case 2: More or equal negative elements
        else {
            for (int i = 0; i < pos.size(); i++) {
                arr.set(2 * i, pos.get(i));
                arr.set(2 * i + 1, neg.get(i));
            }
            
            int index = 2 * pos.size();
            for (int i = pos.size(); i < neg.size(); i++) {
                arr.set(index, neg.get(i));
                index++;
            }
        }
    }
}