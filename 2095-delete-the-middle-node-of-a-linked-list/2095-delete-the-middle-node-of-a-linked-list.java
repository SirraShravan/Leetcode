/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteMiddle(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        int count=0;
        if(head.next==null){
            return null;
    }
        while(fast!=null&&fast.next!=null){
            count++;
            slow=slow.next;
            fast=fast.next.next;
        }
        
        slow=head;
        for(int i=0;i<count-1;i++){
            slow=slow.next;
        }
        slow.next=slow.next.next;
        return head;
    }
}