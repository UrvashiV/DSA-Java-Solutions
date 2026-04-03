// Link: https://www.geeksforgeeks.org/problems/buy-stock-2/1

// Approach:
// Track the minimum price so far.
// For each day, calculate profit = current price - min price.
// Update maximum profit if current profit is higher.
// If a new lower price is found, update min price.


// Dry Run:
// Input: [7, 1, 5, 3, 6, 4]

// Step 1: min=7, max=0
// Step 2: price=1 → min=1
// Step 3: price=5 → profit=4 → max=4
// Step 4: price=3 → profit=2 → max=4
// Step 5: price=6 → profit=5 → max=5
// Step 6: price=4 → profit=3 → max=5

// Output: 5


class Solution {
    public int maxProfit(int[] prices) {
        // Code here
        int n = prices.length;
        int min = Integer.MAX_VALUE;
        int max = 0;

        for (int i = 0; i < n; i++)
        {
            if (prices[i] < min) {
                min = prices[i];
            }
            else if (prices[i] - min > max) {
                max = prices[i] - min;
            }
        }
        return max;
    }
}
