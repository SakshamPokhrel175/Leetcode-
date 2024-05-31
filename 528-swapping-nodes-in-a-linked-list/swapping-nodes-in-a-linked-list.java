class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        ListNode current = head;
        ListNode first = null;
        ListNode second = head;
        
        // Move current k-1 steps forward to find the k-th node from the start
        for (int i = 1; i < k; i++) {
            current = current.next;
        }
        
        // first points to the k-th node from the start
        first = current;
        
        // Move current to the end to find the k-th node from the end
        while (current.next != null) {
            second = second.next;
            current = current.next;
        }
        
        // second now points to the k-th node from the end
        // Swap values between first and second
        int temp = first.val;
        first.val = second.val;
        second.val = temp;
        
        return head;
    }
}