/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
      HashMap<ListNode,Boolean>map=new HashMap<>();
      for(ListNode first=headA;first!=null;first=first.next){
        map.put(first,true);
      }
      for(ListNode sec=headB;sec!=null;sec=sec.next){
        if(map.containsKey(sec)){
            return sec;
        }
      }
      return null;
    }
}