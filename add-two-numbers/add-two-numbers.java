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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        if(l1==null && l2==null)
            return null;
        if(l1==null && l2!=null)
            return l2;
        if(l1!=null && l2==null)
            return l1;
        
        ListNode sumh=new ListNode(0); //dummy head node
        ListNode h=sumh;
        int c=0;

        while(l1!=null || l2!=null || c!=0){
           int x=0,y=0;
            if(l1!=null)
                x=l1.val;
            if(l2!=null)
                y=l2.val;
            
            int s = x+y+c;
            c = s/10;
            s = s%10;
            
            h.next = new ListNode(s);
            h=h.next;
            
            if(l1!=null)
                l1=l1.next;
            if(l2!=null)
                l2=l2.next;
            
        }
        
        
        return sumh.next;
    }
}