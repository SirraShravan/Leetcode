class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode curr=head;
                ListNode temp=head;

        int count=0;
        while(curr!=null){
            curr=curr.next;
            count++;
        }
int pos=count-n;
if(pos==0){
    return head.next;
}
        curr=head;
        for(int i=1;i<pos;i++){
            curr=curr.next;
        }
        curr.next=curr.next.next;
        return head;
    }
}
