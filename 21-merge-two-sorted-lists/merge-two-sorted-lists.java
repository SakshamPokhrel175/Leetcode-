// Thus, the time complexity is:\U0001d442(\U0001d45a+\U0001d45b)
// where \U0001d45a is the length of list a and \U0001d45b is the length of list b.

// Thus, the space complexity is:\U0001d442(1)

class Solution {
    public ListNode mergeTwoLists(ListNode a, ListNode b) {
        ListNode dummy = new ListNode(0);  // Create a dummy node
        ListNode tail = dummy;  // Tail pointer to build the new list

        while (a != null && b != null) {
            if (a.val <= b.val) {
                tail.next = a;
                a = a.next;
            } else {
                tail.next = b;
                b = b.next;
            }
            tail = tail.next;
        }

        // Attach the remaining elements
        if (a == null) {
            tail.next = b;
        } else {
            tail.next = a;
        }

        return dummy.next;  // The merged list is pointed by dummy.next
    }
}
