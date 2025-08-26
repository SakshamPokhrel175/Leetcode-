class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy= new ListNode(0);
        dummy.next=head;
        //two pointer
        ListNode temp1=dummy;
        ListNode temp2=dummy;
        //(n+1) temp1
        for(int i=0;i<=n;i++){
            temp1=temp1.next;
        }
        //until temp1 is null
        while(temp1 != null){
            temp1=temp1.next;
            temp2=temp2.next;
        }
        //delete target node
        temp2.next=temp2.next.next;

        return dummy.next;


        
    }
}