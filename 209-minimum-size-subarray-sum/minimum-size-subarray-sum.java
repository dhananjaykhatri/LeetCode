// TC: O(n)
// SC: O(1)

class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int i = 0;
        int j = 0; 
        int minLen = Integer.MAX_VALUE;
        int windowSum = 0;
        
        while (j < nums.length) {
            // Add the current element to the window's sum
            windowSum += nums[j];

            // Shrink the window from the left as long as the current sum is equal to or larger than the target
            while (windowSum >= target) {
                // Update the minimum length if the current window is smaller than the previous minimum
                minLen = Math.min(minLen, j - i + 1);
                // Subtract the leftmost element of the window from the sum and move the start pointer to the right
                windowSum -= nums[i];
                i++;
            }

            // Move the end pointer to the right to include the next element into the window
            j++;
        }
        // Return the minimum length found; if no such subarray exists, return 0
        return minLen == Integer.MAX_VALUE ? 0 : minLen;
    }
}