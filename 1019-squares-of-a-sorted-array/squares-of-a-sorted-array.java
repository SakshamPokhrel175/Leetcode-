import java.util.*;

class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int i = 0, j = n - 1;
        List<Integer> templist = new ArrayList<>();
        while (i <= j) {
            if (Math.abs(nums[i]) > Math.abs(nums[j])) {
                templist.add(nums[i] * nums[i]);
                i++;
            } else {
                templist.add(nums[j] * nums[j]);
                j--;
            }

        }

        // The list is now [100, 16, 9, 1, 0] for the first example.
        // We must reverse it to be in non-decreasing order.
        // Collections.reverse operates in O(n) time and reverses the list in place.

        Collections.reverse(templist);

        // Convert the ArrayList<Integer> back to a primitive int[] array.
        int[] result = new int[n];
        for (i = 0; i < n; i++) {
            result[i] = templist.get(i);
        }

        return result;

    }
}