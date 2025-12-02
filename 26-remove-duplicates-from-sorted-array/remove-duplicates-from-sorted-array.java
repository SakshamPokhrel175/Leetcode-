class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int k = 1;
        int i = 0, j = 1;
        while (j < n) {
            if (nums[j] == nums[j - 1]) {
                j++;
            } else {
                nums[i + 1] = nums[j];
                i++;
                k++;
                j++;
            }
        }
        return k;

    }
}