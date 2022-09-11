class MinStack {
    private ArrayList<Integer> data; 
    
    public MinStack() {
        data = new ArrayList<>();
    }
    
    public void push(int val) {
        data.add(val);
    }
    
    public void pop() {
        if(data.isEmpty()==false){
            int i = data.size()-1;
            data.remove(i);
        }
    }
    
    public int top() {
        if(data.isEmpty()==false){  
            int i = data.size()-1;
            return data.get(i);
        }
        else
            return 0;
    }
    
    public int getMin() {
          ArrayList<Integer> cloned = (ArrayList<Integer>)data.clone();
          cloned.sort(Comparator.naturalOrder()); //sort the cloned ArrayList in ascending order
          return cloned.get(0);
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */