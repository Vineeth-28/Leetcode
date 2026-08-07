import java.util.Arrays;

class Solution {
    public int findMiddleIndex(int[] nums) {
        // Step 1: Calculate the total sum of all elements in the array
        int totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }
        
        int leftSum = 0;
        
        // Step 2: Iterate through the array to find the middle index
        for (int i = 0; i < nums.length; i++) {
            // Right sum is calculated dynamically: totalSum - leftSum - current element
            int rightSum = totalSum - leftSum - nums[i];
            
            // Check if the left side sum equals the right side sum
            if (leftSum == rightSum) {
                return i; // Return the leftmost middle index
            }
            
            // Add the current element to the left sum for the next iteration
            leftSum += nums[i];
        }
        
        // Return -1 if no middle index exists
        return -1;
    }
}
