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
    }
}