class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minh = new PriorityQueue<>();
        for (int num: nums) {
            minh.add(num);
            if (minh.size() > k) {
                minh.remove();
            }
        }
        
        return minh.peek();
    }
}
    