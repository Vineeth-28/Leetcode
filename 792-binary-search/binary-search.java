class Solution { 
    public int search(int[] nums, int target) { 
        int left = 0; 
        int right = nums.length - 1; 

        // Use a while loop instead of a for loop
        while (left <= right) { 
            // Calculate mid inside the loop so it updates every iteration
            int mid = left + (right - left) / 2; 

            if (nums[mid] == target) { 
                return mid; 
            } else if (nums[mid] < target) { 
                left = mid + 1; 
            } else { // Fixed syntax: else does not take a condition
                right = mid - 1; // Added missing semicolon
            } 
        } 
        return -1; 
    } 
}
