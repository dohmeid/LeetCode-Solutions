class Solution {
    
    HashMap<Integer, Integer> cache = new HashMap<Integer, Integer>();
    
    public int fib(int n) {
        
        if(cache.containsKey(n))
            return cache.get(n);
        
        int result=0;
        if(n<2)
            result = n;
        else{
            result = fib(n-1)+fib(n-2);
        }
        
        cache.put(n,result);
        
        return result;
    }
}