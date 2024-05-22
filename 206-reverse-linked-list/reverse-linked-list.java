class Solution {
    public ListNode reverseList(ListNode head) {
        // Base case: if head is null or there's only one node, return head
        if (head == null || head.next == null) {
            return head;
        }

        // Recursively reverse the rest of the list
        ListNode last = reverseList(head.next);

        // Adjust the pointers
        head.next.next = head;
        head.next = null;

        return last;
    }
}   

/**
Time Complexity: \U0001d442(\U0001d45b), where \U0001d45b is the number of nodes in the linked list.
Space Complexity: \U0001d442(\U0001d45b), where \U0001d45b is the number of nodes in the linked list (due to the recursion stack).

 */
