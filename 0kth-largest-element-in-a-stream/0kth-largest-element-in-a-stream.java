class KthLargest { //solution using min heap
    
    PriorityQueue<Integer> heap;      //heap is represented by PriorityQueue
    int k=0;
    
    public KthLargest(int k, int[] nums) {
        heap =  new PriorityQueue<>();
        this.k = k;
        for (int num: nums)
            heap.offer(num);
        while (heap.size() > k) 
            heap.poll(); //the heap will store the k largest numbers only
    }
    
    public int add(int val) {
        heap.offer(val);
        if (heap.size() > k) {
            heap.poll();
        }
        return heap.peek();        
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */