class Solution {
    public int findDuplicate(int[] nums) {
        int left=nums[0];
        int right=nums[0];
        left=nums[left];
        right=nums[nums[right]];

        //detect cycle
        while(left!=right){
            left=nums[left];
            right=nums[nums[right]];      
        }

        //duplicate find
        left=nums[0];
        while(left!=right){
            left=nums[left];
            right=nums[right];
        }

        return left;
        
    }
}