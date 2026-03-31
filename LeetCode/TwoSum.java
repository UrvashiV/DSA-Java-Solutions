// Link: https://leetcode.com/problems/two-sum/

// Approach:
// Use a HashMap to store value → index.
// For each element, calculate (target - element).
// If the complement exists in the map, return indices.
// Otherwise, store the current element with its index.


// Dry Run:
// Input: nums = [2, 7, 11, 15], target = 9

// Step 1: map = {}
// Step 2: i=0 → nums[i]=2 → complement=7 → not in map → put (2,0)
// Step 3: i=1 → nums[i]=7 → complement=2 → found in map

// Output: [0, 1]


import java.util.*;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        for(int i=0;i<n;i++){
            int a = target - nums[i];
            if(map.containsKey(a)){
                return new int[]{map.get(a),i};
            }
            map.put(nums[i],i);
        }
        return new int[]{ -1, -1 };
    }
}
