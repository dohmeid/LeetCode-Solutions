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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        
        if(list1==null && list2==null)
            return null;
        if(list1==null && list2!=null)
            return list2;
        if(list1!=null && list2==null)
            return list1;
        
        ListNode[] nodes = new ListNode[100]; //array of all nodes
        for(int i=0;i<nodes.length;i++)
            nodes[i]=null;
        int k=0;
        
        ListNode l1=list1;
        ListNode l2=list2;
        
        while(l1!=null){
            nodes[k]=l1;
            l1=l1.next;
            k++;
        }
        while(l2!=null){
            nodes[k]=l2;
            l2=l2.next;
            k++;
        }
        
        sortA(nodes);
        ListNode head=null;
        ListNode h=null;
        for(int i=0;i<nodes.length;i++){
            
            if(nodes[i]==null)
                break;
            
            if(i==0){
                head = nodes[i];
                h=head;
            }
            else{
                h.next = nodes[i];
                h=h.next;
            }
                
            
        }
        h.next=null;
        
        return head;  
    }
    
     public void sortA(ListNode[] n) {
         for(int i=0;i<n.length;i++){
              for(int j=i+1;j<n.length;j++) {
                  ListNode temp=null;
                  if(n[i]!=null && n[j]!=null && n[i].val>n[j].val){
                        temp = n[i];               
                        n[i] = n[j];            
                        n[j] = temp;
                  }  
              }
         }
     }  
    
}