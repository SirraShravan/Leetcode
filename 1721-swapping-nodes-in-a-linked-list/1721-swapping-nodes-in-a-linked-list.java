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
    public ListNode swapNodes(ListNode head, int k) {
        List<Integer>list=new LinkedList<>();
        
       ListNode curr=head;
       int count=0;
       while(curr!=null){
        count++;
        curr=curr.next;
       }
       int pos=count-k;
       ListNode first=head;
       for(int i=1;i<count-k+1;i++){
            first=first.next;
       }
         ListNode sec=head;
         for(int i=1;i<k;i++){
            sec=sec.next;
         }
         int temp=first.val;
         first.val=sec.val;
         sec.val=temp;
         return head;
    }
}