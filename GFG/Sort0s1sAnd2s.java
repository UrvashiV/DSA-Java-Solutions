// Link: https://www.geeksforgeeks.org/problems/sort-an-array-of-0s-1s-and-2s4231/1

// Approach:
// Use Dutch National Flag Algorithm.
// Maintain three pointers: low (l), mid (m), and high (h).
// If arr[m] == 0 → swap with l, increment l and m.
// If arr[m] == 1 → just move m.
// If arr[m] == 2 → swap with h, decrement h.


// Dry Run:
// Input: [2, 0, 2, 1, 1, 0]

// Step 1: l=0, m=0, h=5 → arr[m]=2 → swap with h → [0,0,2,1,1,2], h=4
// Step 2: l=0, m=0, h=4 → arr[m]=0 → swap with l → [0,0,2,1,1,2], l=1, m=1
// Step 3: l=1, m=1, h=4 → arr[m]=0 → swap with l → [0,0,2,1,1,2], l=2, m=2
// Step 4: l=2, m=2, h=4 → arr[m]=2 → swap with h → [0,0,1,1,2,2], h=3
// Step 5: l=2, m=2, h=3 → arr[m]=1 → m=3
// Step 6: l=2, m=3, h=3 → arr[m]=1 → m=4 (loop ends)

// Output: [0, 0, 1, 1, 2, 2]


class Solution {
    public void sort012(int[] arr) {

        int l=0; int m=0; int h= arr.length-1;
        while(m<= h)
        {
            if (arr[m]==0){
                int temp= arr[l];
                arr[l]= arr[m];
                arr[m]=temp;
                m++;
                l++;
            }
            else if (arr[m]==1){
                m++;
            }
            else
            { 
                int temp = arr[m];
                arr[m]=arr[h];
                arr[h]=temp;
                h--;
            }
        }
        
        
    }
}
