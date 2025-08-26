class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // Step 1: Create dummy node
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        // Step 2: Set pointers
        ListNode temp1 = dummy;
        ListNode temp2 = dummy;

        // Step 3: Move temp1 (n+1) steps ahead using loop variable i
        for (int i = 0; i <= n; i++) {
            temp1 = temp1.next;
        }
        // Step 4: Move both pointers until temp1 reaches null
        while (temp1 != null) {
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        // Step 5: Delete the target node
        temp2.next = temp2.next.next;

        // Step 6: Return new head
        return dummy.next;

    }
}







// 1. Create a dummy node pointing to head.
// 2. Set two pointers: temp1 = dummy, temp2 = dummy.
// 3. Move temp1 ahead by (n+1) steps using a for loop with i.
// 4. Move temp1 and temp2 one step until temp1 reaches null.
// 5. Now temp2 is just before the node to delete.
// 6. Skip that node: temp2.next = temp2.next.next
// 7. Return dummy.next as new head.
