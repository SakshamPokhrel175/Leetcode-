class Solution {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums); //Ascending order
        return nums[nums.length - k];
    }
}