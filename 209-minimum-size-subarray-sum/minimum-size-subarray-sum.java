class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int low = 0;
        int sum = 0;
        int result = Integer.MAX_VALUE;

        for (int high = 0; high < nums.length; high++) {
            sum += nums[high];

            while (sum >= target) {
                int length = high - low + 1;
                result = Math.min(result, length);
                sum -= nums[low];
                low++;
            }
        }

        return result == Integer.MAX_VALUE ? 0 : result;
    }
}




// class Solution {
//     public int minSubArrayLen(int target, int[] nums) {
//         //hiring and fiering
//         int low = 0;
//         int high = 0;
//         int result = Integer.MAX_VALUE;
//         int sum = 0;

//         while (high < nums.length) {
//             sum = sum + nums[high];
//             while (sum >= target) {
//                 int length = high - low + 1;
//                 result = Math.min(result, length);
//                 sum = sum - nums[low];
//                 low++;
//             }
//             high++;
//         }

//         if (result == Integer.MAX_VALUE) {
//             return 0;
//         }
//         return result;

//     }
// }