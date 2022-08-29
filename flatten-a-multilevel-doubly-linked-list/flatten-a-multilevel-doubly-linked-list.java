/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {
        
        if(head==null)
            return null;
        
        Node h = head;
        
        while(h!=null){
            
            if(h.child == null){
                h=h.next;
            }
            
            else{
              Node p = h.next;
              Node ch = h.child;
                
              h.next = ch;
              ch.prev = h;
              Node hh = ch;
                
               while(ch.next != null){
                   ch = ch.next;
               }
               ch.next = p;
               if(p!=null)
                    p.prev = ch;
               h.child=null;
               h=hh;
                
            }
            
        }
       
        
        
        
        
        
        return head;
    }
}