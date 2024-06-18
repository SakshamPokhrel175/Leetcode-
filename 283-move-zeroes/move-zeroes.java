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

// Example Walkthrough:
// Given the array [0, 1, 0, 3, 12]:

// Start with j = 0 and the array [0, 1, 0, 3, 12].
// i = 0: nums[0] is 0, so nothing is swapped, and j remains 0.
// i = 1: nums[1] is 1, which is non-zero.
// Swap nums[1] and nums[0] to get [1, 0, 0, 3, 12].
// Increment j to 1.
// i = 2: nums[2] is 0, so nothing is swapped, and j remains 1.
// i = 3: nums[3] is 3, which is non-zero.
// Swap nums[3] and nums[1] to get [1, 3, 0, 0, 12].
// Increment j to 2.
// i = 4: nums[4] is 12, which is non-zero.
// Swap nums[4] and nums[2] to get [1, 3, 12, 0, 0].
// Increment j to 3.
// After the loop, all non-zero elements are moved to the front, and all zeroes are moved to the end of the array. The final array is [1, 3, 12, 0, 0]




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