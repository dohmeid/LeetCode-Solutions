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
    public ListNode middleNode(ListNode head) {
        
        if(head==null) return null;
        ListNode h=head;
        int len=0;
        while(h!=null){
            h=h.next;
            len++;
        }
        h=head;
        int step=0;
        while(step!=len/2){
               h = h.next;
            step++;
        }
        
        
        return h;
    }
}