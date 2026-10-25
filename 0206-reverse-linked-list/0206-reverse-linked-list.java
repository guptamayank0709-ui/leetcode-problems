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
    public ListNode reverseList(ListNode head) {
       ListNode pres = head;
       if(pres==null||pres.next==null){
        return pres;
       }
       ListNode next = pres.next;
       ListNode prev = null;

       while(pres!=null){
        pres.next = prev;
        prev = pres;
        pres = next;
        if(next!=null){
        next = next.next;
       }
       }
       head = prev;
       return head;
    }
}