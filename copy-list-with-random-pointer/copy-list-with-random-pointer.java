/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if(head==null)
            return null;
        
        Node oldh = head;
        Node nhead=new Node(0);//dummy head
        Node h = nhead;
        
        int size=0;
        while(oldh != null){
            Node n=new Node(0);
            n.val=oldh.val;
            oldh = oldh.next;
            h.next=n;
            h=h.next;
            size++;
        }
        h.next=null;
        
        oldh=head;
        h=nhead.next;
        while(oldh != null){
            if(oldh.random==null)
                h.random = null;
            else{
                Node p=head;
                for(int i=0;i<size;i++){
                    if(p==oldh.random){
                        p=nhead.next;
                         for(int k=0;k<size;k++){
                             if(k==i)
                                 h.random=p;
                             else
                                 p=p.next;
                         }
                        break;
                    }
                    else
                        p=p.next;
                }
           
            }
            
            oldh = oldh.next;
            h=h.next;
        }
        
        return nhead.next;
    }
}