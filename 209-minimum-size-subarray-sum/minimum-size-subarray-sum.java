class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int currentSum = 0;
        int minLength = Integer.MAX_VALUE;

        for (int right = 0; right < nums.length; right++) {
            currentSum += nums[right]; // Expand the window by adding the current element

            // Shrink the window from the left as long as the condition is met
            while (currentSum >= target) {
                minLength = Math.min(minLength, right - left + 1);
                currentSum -= nums[left];
                left++;
            }
        }

        // If minLength was never updated, it means no valid subarray was found
        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }
}
