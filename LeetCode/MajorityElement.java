// Link: https://leetcode.com/problems/majority-element/

// Approach:
// Use a HashMap to store frequency of elements.
// Traverse the array and update count using getOrDefault.
// If any element frequency becomes greater than n/2,
// return that element immediately.


// Dry Run:
// Input: [3, 2, 3]

// Step 1: map = {}
// Step 2: i=0 → num=3 → map={3:1}
// Step 3: i=1 → num=2 → map={3:1, 2:1}
// Step 4: i=2 → num=3 → map={3:2, 2:1}

// Check: 2 > n/2 (1) → true

// Output: 3


import java.util.*;

class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
       
        for (int i=0;i<nums.length;i++)
        {
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
            if (map.get(nums[i]) > nums.length / 2) {
                return nums[i];
            }
        }

        return -1;
    }
}
