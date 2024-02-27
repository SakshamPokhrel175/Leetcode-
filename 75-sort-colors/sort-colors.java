class Solution {
    public void sortColors(int[] nums) {
        int low = 0, mid = 0, high = nums.length - 1;
        
        while (mid <= high) {
            if (nums[mid] == 0) {
                swap(nums, low, mid);
                low++;
                mid++;
            } else if (nums[mid] == 1) {
                mid++;
            } else if (nums[mid] == 2) {
                swap(nums, mid, high);
                high--;
            }
        }
    }

     void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}





// class Solution {
//     public void sortColors(int[] nums) {
//         int count_0=0;
//         int count_1=0;
//         int count_2=0;
//         int i;
//         int n = nums.length;

//         for (i = 0; i < n; i++) {
//             if (nums[i] == 0)
//                 count_0++;

//             else if (nums[i] == 1)
//                 count_1++;

//             else
//                 count_2++;
//         }

//         for (i = 0; i < count_0; i++) {
//             nums[i] = 0;
//         }

//         for (i = count_0; i < count_0 + count_1; i++) {
//             nums[i] = 1;
//         }
//         for (i = count_0 + count_1; i < n; i++) {
//             nums[i] = 2;
//         }

//     }
// }


// class Solution {
//     public void sortColors(int[] nums) {
//         Arrays.sort(nums);
//         return ;
//     }
// }