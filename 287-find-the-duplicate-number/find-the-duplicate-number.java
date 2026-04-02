class Solution {
    public int findDuplicate(int[] nums) {
        int i=nums[0];
        int j=nums[0];
        i=nums[i];
        j=nums[nums[j]];

        //detect cycle
        while(i!=j){
            i=nums[i];
            j=nums[nums[j]];
        }

        //find duplicate
        i=nums[0];
        while(i!=j){
            i=nums[i];
            j=nums[j];
        }

        

        return i;
    }
}

// Your code has 2 phases:

// 1️⃣ Detect cycle (meeting point)
// 2️⃣ Find cycle start (duplicate number)


    

// left = nums[0];

// This is the most confusing but important part.

// 💡 Key idea

// When slow & fast meet:

// They are somewhere inside the cycle
// NOT necessarily at the start

// We want:
// 👉 start of cycle = duplicate number
    

// Start → → → → [Cycle Start] → → → → (loop)
//                   ↑              ↓
//                   ← ← ← ← ← ← ← ←





//o(nlogn)
// class Solution {
//     public int findDuplicate(int[] nums) {
//         Arrays.sort(nums);

//         for (int i = 1; i < nums.length; i++) {
//             if (nums[i] == nums[i - 1]) {
//                 return nums[i];

//             }
//         }
//         return -1;

//     }
// }