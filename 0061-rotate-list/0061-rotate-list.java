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
    public ListNode rotateRight(ListNode head, int k) {
      ListNode temp=head;
      if(head==null||head.next==null||k==0){
        return head;
      }
      int count=1;
      while(temp.next!=null){
        temp=temp.next;
        count++;
      }
      if(head==null){
        return null;
      }
      temp.next= head;
      int pos=count-(k%count);
    temp=head;
      for(int i=0;i<pos-1;i++){
            temp=temp.next;
      }
      ListNode currHead=temp.next;
      temp.next=null;
      return currHead;

    }
}