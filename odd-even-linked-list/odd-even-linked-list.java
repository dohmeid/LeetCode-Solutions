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
    public ListNode oddEvenList(ListNode head) {
        
        if(head == null)
            return null;
        
        if(head.next == null || head.next.next == null)
            return head;
        
        
        
        LinkedList<ListNode> even = new LinkedList<>();  

        ListNode h = head ;
        ListNode prev = null ;
        int flag = 1;
        while(h!=null){
           
            if(flag%2 != 0) //odd
            {
                prev = h;
                h=h.next;
            }
            else //even
            {
                prev.next = h.next;
                even.add(h);
                h = prev.next ;
            }
            flag++;
        }
        
        h = head ;
        while(h.next!=null){
            h=h.next;
        }
        
        for(int i=0; i<even.size() ; i++){
            h.next = even.get(i);
            h=h.next;
        }
        h.next=null;
        
        return head;
    }
}