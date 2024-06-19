class Solution {
    // Time Complexity: O(n) where n is the length of the input array nums.
    // Space Complexity: O(1), constant space usage.
    
    public int maxSubArray(int[] nums) {
        int sum = 0;                    // Initialize a variable to keep track of the current subarray sum
        int max_sum = nums[0];          // Initialize max_sum with the first element of nums

        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];        // Add the current element to sum to expand the current subarray
            
            if (sum > max_sum) {        // If sum is greater than max_sum, update max_sum
                max_sum = sum;
            }

            if (sum < 0) {              // If sum becomes negative, reset it to 0
                sum = 0;
            }
        }
        
        return max_sum;                 // Return max_sum, which holds the maximum subarray sum found
    }
}
