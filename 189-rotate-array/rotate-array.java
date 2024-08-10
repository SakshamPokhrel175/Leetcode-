public class Solution {

    static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    static void rotate(int[] arr, int k) {
    int n = arr.length;
    k = k % n; // Handle cases where k > n

    reverse(arr, 0, n - k - 1); // Reverse the first part
    reverse(arr, n - k, n - 1); // Reverse the second part
    reverse(arr, 0, n - 1);     // Reverse the entire array
    }


}
