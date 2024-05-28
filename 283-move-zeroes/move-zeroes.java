class Solution {
    public void moveZeroes(int[] nums) {
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                j++;
            }
        }

    }
}

// class Solution {
//     public void moveZeroes(int[] nums) {
//         int n=nums.length;

//         int j=0;
//         for(int i=0;i<n;i++){
//             if(nums[i]!=0){
//                 nums[j]=nums[i];
//                 j++;
//             }
//         }

//         for(;j<n;j++){
//             nums[j]=0;
//         }
//     }
// }