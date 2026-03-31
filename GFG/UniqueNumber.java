// Link: https://www.geeksforgeeks.org/problems/find-the-odd-occurring-number/1

// Approach:
// Use XOR operation to find the unique element.
// XOR of same numbers cancels out (a ^ a = 0).
// XOR with 0 gives the number itself (a ^ 0 = a).
// So, all duplicate elements will cancel out,
// leaving only the unique element.


// Dry Run:
// Input: [1, 2, 3, 2, 1]

// Step 1: xor = 0
// Step 2: xor = 0 ^ 1 = 1
// Step 3: xor = 1 ^ 2 = 3
// Step 4: xor = 3 ^ 3 = 0
// Step 5: xor = 0 ^ 2 = 2
// Step 6: xor = 2 ^ 1 = 3

// Output: 3


class Solution {
    public int findUnique(int[] arr) {
        // code here
        int xor = 0;
        for(int i: arr){
            xor = xor ^ i;
        }
        return xor;
    }
}
