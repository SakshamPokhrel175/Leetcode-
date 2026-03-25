class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) { //O(n)
            int needed = target - nums[i];

            if (map.containsKey(needed)) {  // check first
                return new int[] { map.get(needed), i };
            }

            map.put(nums[i], i);  // store after

        }

        return new int[] {};

    }
}