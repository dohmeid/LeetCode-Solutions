class MyLinkedList {

    
    class DoublyListNode {
    int val=0;
    DoublyListNode next=null, prev=null;
    DoublyListNode(int x) {val = x;}
    }
    
    DoublyListNode head;
    DoublyListNode tail;
    int len;
    
    public MyLinkedList() {
        this.head = null;
        this.tail = null;
        this.len = 0;
    }
    
    public int get(int index) {
        if(index<0 || index>=this.len)
            return -1;
        else{
            DoublyListNode cur=this.head;
            for(int i=0; i< this.len; i++){
                if(index != i){
                    cur = cur.next;
                }
                else
                    break;    
            } 
            return cur.val;
        }
    }
    
    public void addAtHead(int val) {
        DoublyListNode cur= new DoublyListNode(val);
         if(this.len == 0){
            this.head = cur;
            this.tail = cur;
            this.len++;
        }
        else{
        this.head.prev = cur;
        cur.next = this.head;
        cur.prev = null;
        this.head = cur; 
        this.len++;
        }
    }
    
    public void addAtTail(int val) {
         DoublyListNode cur= new DoublyListNode(val);
         if(this.len == 0){
            this.head = cur;
            this.tail = cur;
            this.len++;
        }
        else{
        this.tail.next = cur;
        cur.prev = this.tail;
        cur.next = null;
        this.tail=cur;
        this.len++;
        }
    }
    
    public void addAtIndex(int index, int val) {
    
        if(index == this.len){
        addAtTail(val) ;
        }
        else if(index == 0){
        addAtHead(val);  
        }
        else if(index < this.len && index>0){
          DoublyListNode n= new DoublyListNode(val);
          DoublyListNode cur=this.head;
           
            for(int i=0; i<this.len; i++){
                 if(index != i)
                  cur = cur.next;
              else
                break;
            }
           DoublyListNode pr =  cur.prev;
           n.prev = pr; 
           pr.next = n;

           cur.prev = n;
           n.next = cur;
            this.len++;
        }
    }
    
    public void deleteAtIndex(int index) {
       if(this.len != 0){
           
        if(index == this.len-1){ //delete at end
             if(this.len == 1){
                this.head = null;
                this.tail = null;
             }
            else{
              DoublyListNode t = this.tail;
              DoublyListNode pr = t.prev;
              pr.next=null;
                 t.prev=null;
              this.tail = pr;
             
           }
             this.len--;
        }
           
        else if(index == 0){ //delete first node
            if(this.len == 1){
                this.head = null;
                this.tail = null;
             }
            else{
            DoublyListNode h = this.head;
            DoublyListNode cur = h.next;
            h.next = null;
            cur.prev=null;
            this.head = cur;
        }
            this.len--;
    }
        
        else if(index < this.len && index>0){
            DoublyListNode cur=this.head;
            for(int i=0; i<this.len; i++){
              if(index != i)
                 cur = cur.next;
              else
                break;
            }   
            
            DoublyListNode n = cur.next;
            DoublyListNode pr = cur.prev;
            pr.next=n;
            n.prev=pr;
            cur.prev=null;
            cur.next=null;
            
            
            this.len--;
        }
        
        }
    }
    
    
    }
/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */