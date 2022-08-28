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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        ListNode h = head;
        int len=0;
        while(h != null){
            h= h.next;
            len++;
        }
        
        if(len == 1 && n==1){
            return null;
        }
        else if( n>len){
            return head;
        }
        else if(len == 2){
            h = head;
            if(n==1){ //remove last
                h.next = null;
                return h;
            }
            else{ //remove first
                ListNode nn = h.next;
                h.next=null;
                return nn;
            }
            
        }
        
        else if (n==1){ //remove last node
            h = head;
            for(int i=1; i<=len-2;i++){
                h=h.next;
            }
            h.next = null;
            return head;   
        }
        
        else if(n==len){ //remove first node
            h = head;
            ListNode nn = h.next;
            h.next=null;
            return nn;
        }
        
    
        else{
            h = head;
            for(int i=1; i<=len-n-1;i++){
                h=h.next;
            }
            ListNode rm = h.next;
            h.next = rm.next;
            rm.next = null;
        
        } 
        
        return head;
    }
}