// Link: https://www.geeksforgeeks.org/problems/majority-element-1587115620/1

// Approach:
// Use Boyer-Moore Voting Algorithm.
// First pass: find a candidate element.
// If count becomes 0, update candidate.
// Increase count if same, else decrease.
// Second pass: verify if candidate appears more than n/2 times.


// Dry Run:
// Input: [2, 2, 1, 1, 2, 2]

// First Pass:
// candidate=2, count=1
// next 2 → count=2
// next 1 → count=1
// next 1 → count=0
// next 2 → candidate=2, count=1
// next 2 → count=2

// Candidate = 2

// Second Pass:
// count occurrences of 2 → 4

// Check: 4 > n/2 (3) → true

// Output: 2


class Solution {
    int majorityElement(int arr[]) {
        int candidate = 0;
        int count = 0;

        for (int num : arr) {
            if (count == 0) {
                candidate = num;
            }

            if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }

        count = 0;
        for (int num : arr) {
            if (num == candidate) {
                count++;
            }
        }

        if (count > arr.length / 2) {
            return candidate;
        }

        return -1;
    }
}
