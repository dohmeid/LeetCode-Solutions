class TimeMap { //1 HashMap with TreeMap as value of it solution

    HashMap<String, TreeMap<Integer,String>> map1;  
    // string1 is the key ,int is the key of the treemap and it is the timestamp ,string2 is the value of the treemap
    
    public TimeMap() {
        map1 = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
         TreeMap<Integer,String> map2; 
         if (!map1.containsKey(key)) 
             map2 = new TreeMap<>();
         else
             map2 = map1.get(key);
        map2.put(timestamp,value);
        map1.put(key,map2);
    }
    
    public String get(String key, int timestamp) {
         if (map1.containsKey(key)){
            TreeMap<Integer,String> map2 = map1.get(key);
            Integer floorKey = map2.floorKey(timestamp); 
            //The floorKey() method is used to return the greatest key less than or equal to given key from the parameter.
            if (floorKey != null) 
                return map2.get(floorKey);
         }
         return "";  
    }
}

/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */