class Solution {
    public ListNode removeElements(ListNode head, int val) {
        
        if(head == null)
            return null;
        
        ListNode h = head;
        ListNode prev = null;
     
        while(h != null){
            
            if(h.val == val){ //remove this node
                if(prev == null)//delete 1st node
                    head = h.next;
                else          
                    prev.next=h.next;
            }
            else
                prev = h;
            h=h.next;
        }
        
        
        return head;
    }
}