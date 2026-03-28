class Solution {
    public void sortColors(int[] nums) {
        int i=0;
        int left=0; //j
        int right=nums.length-1;  //k
    
            // int left=0;
            // int right=nums.length-1;

            while(left<=right){
                if(nums[left]==0){
                    int temp=nums[left];
                    nums[left]=nums[i];
                    nums[i]=temp;
                    left++;
                    i++;
                }else if(nums[left]==1){
                    left++;
                }else{ //(left==2)
                    int temp=nums[left];
                    nums[left]=nums[right];
                    nums[right]=temp;
                    right--;
                }
            }
        
        
    }
}