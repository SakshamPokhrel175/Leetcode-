class Solution {
    public int removeDuplicates(int[] nums) {

        if (nums.length == 0)
            return 0;
        int count = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[count] = nums[i];
                count++;
            }
        }

        return count;

    }
}

// class Solution {
//     public int removeDuplicates(int[] nums) {
//         if (nums.length == 0) return 0;

//         int j = 0; // Index of the last unique element

//         for (int i = 1; i < nums.length; i++) {
//             if (nums[i] != nums[j]) {
//                 j++;
//                 nums[j] = nums[i];
//             }
//         }

//         return j + 1; // Length of array with unique elements
//     }
// }

// class Solution {
//     public int removeDuplicates(int[] nums) {
//         int j = 1;
//         for (int i = 1; i < nums.length; i++) {
//             if (nums[i] != nums[j - 1]) {
//                 nums[j] = nums[i];
//                 j++;
//             }
//         }
//         return j;
//     }
// }

// class Solution {
//     public int removeDuplicates(int[] nums) {
//         if (nums.length == 0) return 0;

//         int j = 0; // Pointer for the position of the last unique element

//         for (int i = 1; i < nums.length; i++) {
//             if (nums[i] != nums[j]) {
//                 j++; // Move to the next position for the unique element
//                 nums[j] = nums[i]; // Update the array with the new unique element
//             }
//         }

//         return j + 1; // Length of the array with unique elements
//     }
// }

// class Solution {
//     public int removeDuplicates(int[] arr) {
//         int i = 0;  // Pointer to track the last unique element position
//         if(arr.length==0){
//             return 0;
//         }

//         // Iterate through the array starting from the second element
//         for (int j = 1; j < arr.length; j++) {
//             // If the current element is different from the previous unique element
//             if (arr[i] != arr[j]) {
//                 i++;  // Move the pointer to the next position
//                 arr[i] = arr[j];  // Store the current unique element at index i
//             }
//             // If arr[i] == arr[j], it means j-th element is a duplicate, so we skip it
//         }

//         // Return the length of the array with unique elements (i + 1)
//         return i + 1;
//     }
// }

// // Example:
// // Given the sorted array arr = [1, 1, 2, 2, 3, 4, 4, 5]:

// // Initial State: i = 0 (for arr[0] = 1, the first unique element)

// // Iteration:

// // j = 1: arr[1] = 1 (duplicate of arr[0])
// // j = 2: arr[2] = 2 (new unique element)
// // Increment i to 1, store arr[2] at arr[1]
// // j = 3: arr[3] = 2 (duplicate of arr[2])
// // j = 4: arr[4] = 3 (new unique element)
// // Increment i to 2, store arr[4] at arr[2]
// // ... and so forth.
// // Final State: Modified array arr = [1, 2, 3, 4, 5, ...]

// // Return Value: i + 1 = 5, which is the length of the array containing unique elements.

// // Complexity:
// // Time Complexity: O(n), where n is the length of the array arr. Each element is visited exactly once.
// // Space Complexity: O(1). The algorithm uses only a constant amount of extra space, regardless of the input size, as it modifies the array in-place.
