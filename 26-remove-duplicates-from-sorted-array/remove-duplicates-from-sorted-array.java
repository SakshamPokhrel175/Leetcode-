class Solution {
    public int removeDuplicates(int[] nums) {
        //TWO pointer
        int n = nums.length;
        int i = 0;
        int j = 1;

        while (j < n) {
            if (nums[i] != nums[j]) { //get unique
                i++;
                nums[i] = nums[j];
            }
            j++; //to find unique  move left to right 
        }

        return i + 1;

    }   
}