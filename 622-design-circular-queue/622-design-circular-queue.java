class MyCircularQueue {

    private int [] ar;   //fixed-size array       
    private int head;  // a pointer to indicate the start position
    private int tail;  // a pointer to indicate the start position    
    
    public MyCircularQueue(int k) {
        ar = new int[k];
        for(int i=0;i<k;i++)
            ar[i]=-1;
        head=0;
        tail=-1;
    }
    
    public boolean enQueue(int value) {
        if(this.isFull()==true)
            return false;
        if(tail+1 == ar.length){
            tail=0;
            ar[tail]=value;
        }
        else{ 
        tail++;
        ar[tail]=value;
         }
        return true;
    }
    
    public boolean deQueue() {
        if(this.isEmpty()==true)
            return false;
        ar[head] = -1;
        if(head+1 == ar.length)
            head=0;
        else
         head++;
        return true;
    }
    
    public int Front() {
        if(this.isEmpty()==true)
            return -1;
        else
            return ar[head];
    }
    
    public int Rear() {
        if(this.isEmpty()==true)
            return -1;
        else
            return ar[tail];
    }
    
    public boolean isEmpty() {
        for(int i=0; i<ar.length;i++){
            if(ar[i]!=-1)
                return false;
        }
        return true;
    }
    
    public boolean isFull() {
        for(int i=0; i<ar.length;i++){
            if(ar[i]==-1)
                return false;
        }
        return true;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */