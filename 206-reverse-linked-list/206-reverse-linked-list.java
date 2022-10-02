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
     
     /*   solution 1 : using stack  
        if(head==null)
            return null;
        else if(head.next == null) //there is only head node
            return head;
        else{
         
           Stack<ListNode> stack = new Stack<ListNode>();
            ListNode h = head;
            stack.push(h);
            int len=1;
            while(h.next!=null ){
                h=h.next;
                stack.push(h);
                len++;
            }
            
            ListNode n = stack.pop(); //new head
            head = n;
            h = n;
            ListNode nxt = null; 
            while(stack.empty() == false){
               
                nxt= stack.pop();
                h.next = nxt;
                h =  h.next;
            }
            h.next=null;
            
            
            return head ;
        }
        */
        
        //solution2 : iteratively
        if(head==null)
            return null;
        if(head.next == null) //there is only head node
            return head;
    
            ListNode newhead = null;
            while(head!=null){
                 ListNode n = head.next;
                 head.next=newhead;
                newhead = head;
                 head = n;
                
            }
        
        return newhead;
        
        
        //solution2 : recursively
     /*    if(head==null)
            return head;
        
        reverseList(head.next);
         
        
        return head;*/
    }
}