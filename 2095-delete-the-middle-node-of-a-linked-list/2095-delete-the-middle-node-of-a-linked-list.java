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
        
        //get the size of the list
        ListNode h = head;
        int n=0;
        while(h!=null){
            h=h.next;
            n++;
        }
        //iterate till reaching the node to be deleted
        ListNode prev = head;
        h = head;
        for(int i=0 ; i<n/2 ; i++){
            prev = h;
            h=h.next;
        }
        //delete the node
        prev.next = h.next;
        h.next = null;
        
        return head;
    }
}