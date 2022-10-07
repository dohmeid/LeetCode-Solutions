class MyCalendarThree {
    TreeMap<Integer, Integer> map;
    
    public MyCalendarThree() {
        map = new TreeMap<>();
    }
    
    public int book(int start, int end) {
        
        if (!map.containsKey(start))
            map.put(start, 1);
        else 
            map.put(start, (map.get(start)+1));
        
        if (!map.containsKey(end))
            map.put(end, -1);
        else
            map.put(end, (map.get(end)-1));
        
        int max = 0, count = 0;
        for(int val : map.values()){
            count += val;
            max = Math.max(max, count);
        }
        return max;
    }
    
    
}

/**
 * Your MyCalendarThree object will be instantiated and called as such:
 * MyCalendarThree obj = new MyCalendarThree();
 * int param_1 = obj.book(start,end);
 */