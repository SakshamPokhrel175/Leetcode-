class Solution {
    public int removeDuplicates(int[] arr) {
        int i = 0;  // Pointer to track the last unique element position
        
        // Iterate through the array starting from the second element
        for (int j = 1; j < arr.length; j++) {
            // If the current element is different from the previous unique element
            if (arr[i] != arr[j]) {
                i++;  // Move the pointer to the next position
                arr[i] = arr[j];  // Store the current unique element at index i
            }
            // If arr[i] == arr[j], it means j-th element is a duplicate, so we skip it
        }
        
        // Return the length of the array with unique elements (i + 1)
        return i + 1;
    }
}


