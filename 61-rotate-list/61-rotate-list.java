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
        if(head==null)
            return null;
        if(head.next == null)
            return head;
       
        int len=0;
        ListNode p=head;
        while(p!=null){
            p=p.next;
            len++;
        }
        k=k%len;
        
        p=head;
        while(k!=0){
            while(p.next.next!=null){
                p=p.next;
            }
            ListNode prev=p;
            ListNode tail=p.next;
            
            prev.next=null;
            tail.next = head;
            head = tail;
            p=head;
            
            k--;
        }
        
        
        
        return head;
    }
}