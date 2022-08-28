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
    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next==null)
          return true;  
        
           
        Stack<ListNode> stack = new Stack<ListNode>();
        ListNode h=head;
        int len=0;
        while(h!=null){
            h=h.next;
            len++;
        }
        h=head;
        for(int i=0; i<len; i++){
            if(i < (len/2)){
                h=h.next;
            }
            else if(len%2!=0 && i==len/2 ){
                h=h.next;
            }
            else{
                stack.push(h);
                h=h.next;
            }
        }
        
        h=head;
       
        while(stack.empty() == false){
            ListNode n = stack.pop();
            if(h.val != n.val)
                return false;
            h=h.next;
            
        }
            
        return true;
    }
}