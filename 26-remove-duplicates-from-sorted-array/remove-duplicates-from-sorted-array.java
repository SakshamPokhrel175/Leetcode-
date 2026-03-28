class Solution {
    public int removeDuplicates(int[] nums) {
        int unique=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[i-1]){
                nums[unique]=nums[i];
                unique ++;
            }
            
        }

        return unique;
        
    }
}

//https://www.geeksforgeeks.org/problems/remove-duplicate-elements-from-sorted-array/1
//https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/