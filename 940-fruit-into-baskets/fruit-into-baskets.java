class Solution {
    public int totalFruit(int[] fruits) {
        int left = 0;
        int max = Integer.MIN_VALUE;
        Map<Integer, Integer> map = new HashMap<>();

        for (int right = 0; right < fruits.length; right++) {
            int value = fruits[right];
            map.put(value, map.getOrDefault(value, 0) + 1);

            while (map.size() > 2) {
                int leftvalue = fruits[left];
                map.put(leftvalue, map.get(leftvalue) - 1);

                if (map.get(leftvalue) == 0) {
                    map.remove(leftvalue);
                }
                left++;

            }

            if (map.size() <= 2) {
                max = Math.max(max, right - left + 1);
            }
        }

        return max;

    }
}