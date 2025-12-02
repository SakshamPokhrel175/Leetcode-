class Solution {
    public int[] sortedSquares(int[] nums) {
        int n=nums.length;
        int i=0,j=0;
         while(j<n){
             if(nums[i]==nums[j]){
                 nums[i]=nums[i]*nums[j];
                 i++;
                 j++;
             }
         }
        Arrays.sort(nums);

        return nums;
        
    }
}