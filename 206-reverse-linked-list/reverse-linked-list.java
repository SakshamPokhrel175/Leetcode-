class Solution {
    public ListNode reverseList(ListNode head) {
        // Base case: if head is null or there's only one node, return head
        if (head == null || head.next == null) {
            return head;
        }

        // Recursively reverse the rest of the list
        ListNode last = reverseList(head.next);

        // Adjust the pointers to reverse the current node and the next node
        head.next.next = head; // This line reverses the connection between head and head.next
        head.next = null;      // Set head.next to null to break the original link

        return last;           // Return 'last', which is now the new head of the reversed list
    }
}

//https://www.youtube.com/watch?v=RreHsOfi14w&t=494s
/**
Time Complexity: \U0001d442(\U0001d45b), where \U0001d45b is the number of nodes in the linked list.
Space Complexity: \U0001d442(\U0001d45b), where \U0001d45b is the number of nodes in the linked list (due to the recursion stack).

 */
