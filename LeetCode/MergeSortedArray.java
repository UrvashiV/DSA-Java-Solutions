// Link:
// https://leetcode.com/problems/merge-sorted-array/

// Approach:
// - nums1 has enough space (size = m + n) to hold elements of nums2.
// - First, copy all elements of nums2 into nums1 starting from index m.
// - After copying, sort the entire nums1 array.
// - This results in a merged sorted array.

// Dry Run:
// Input:
// nums1 = [1, 2, 3, 0, 0, 0], m = 3
// nums2 = [2, 5, 6], n = 3
//
// Step 1 (copy nums2 into nums1):
// nums1 → [1, 2, 3, 2, 5, 6]
//
// Step 2 (sort):
// nums1 → [1, 2, 2, 3, 5, 6]
//
// Output: [1, 2, 2, 3, 5, 6]

// Time Complexity:
// O((m + n) log(m + n)) → due to sorting

// Space Complexity:
// O(1) → in-place modification (ignoring sorting space)

// Note:
// - This is a simple approach.
// - Optimal solution exists using two pointers from the end with O(m + n) time.

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        // Copy nums2 into nums1
        for (int i = 0; i < n; i++) {
            nums1[i + m] = nums2[i];
        }
        
        // Sort the merged array
        Arrays.sort(nums1);
    }
}
