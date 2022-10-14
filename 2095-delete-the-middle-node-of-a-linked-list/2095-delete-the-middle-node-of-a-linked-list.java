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
        
        if(head.next == null)
            return null;
        
        ListNode h = head;
        int n=0;
        while(h!=null){
            h=h.next;
            n++;
        }
        int middle_index = n/2;
        
        ListNode prev = head;
        h = head;
        for(int i=0 ; i<n/2 ; i++){
            prev = h;
            h=h.next;
        }
        
        prev.next = h.next;
        h.next = null;
        
        
        return head;
    }
}