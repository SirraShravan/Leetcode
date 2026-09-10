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
    public ListNode sortList(ListNode head) {
       return mergesort(head);
        

    }
    private ListNode mergesort(ListNode head){
        if(head==null||head.next==null){
            return head;
        }
        ListNode slow =head;
        ListNode fast=head.next;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode lefthead=head;
        ListNode righthead=slow.next;
        slow.next=null;
        lefthead=mergesort(lefthead);
        righthead=mergesort(righthead);
       return merge(lefthead,righthead);
  
    }
    private ListNode merge(ListNode lefthead,ListNode righthead){
        ListNode dummy=new ListNode(0);
        ListNode temp=dummy;
        while(lefthead!=null&&righthead!=null){
            if(lefthead.val<righthead.val){
                temp.next=lefthead;
                lefthead=lefthead.next;
            }else{
                temp.next=righthead;
                righthead=righthead.next;
            }
            temp=temp.next;
        }
        if(lefthead!=null){
            temp.next=lefthead;
        }
        if(righthead!=null){
            temp.next=righthead;
        }
        return dummy.next;
    }
}