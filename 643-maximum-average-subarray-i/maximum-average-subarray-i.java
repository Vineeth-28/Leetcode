class Solution {
    public double findMaxAverage(int[] nums, int k) {
        // Step 1: Calculate the sum of the first 'k' elements to initialize the window
        int windowSum = 0;
        for (int i = 0; i < k; i++) {
            windowSum += nums[i];
        }
        
        // Track the maximum sum found so far
        int maxWindowSum = windowSum;
        
        // Step 2: Slide the window from index 'k' to the end of the array
        for (int i = k; i < nums.length; i++) {
            // Add the incoming element and subtract the outgoing element
            windowSum += nums[i] - nums[i - k];
            // Track the maximum sum
            maxWindowSum = Math.max(maxWindowSum, windowSum);
        }
        
        // Step 3: Divide the maximum sum by k to return the maximum average
        return (double) maxWindowSum / k;
    }
}
