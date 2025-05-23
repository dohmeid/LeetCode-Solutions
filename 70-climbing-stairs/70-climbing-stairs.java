class Solution {
    //solution is using recursion with memoization 
    Map<Integer, Integer> cache = new HashMap<>();
    public int climbStairs(int n) {
        
        if(cache.containsKey(n))
            return cache.get(n);
            
        int res=0;
        if(n<=2)
            res = n;
        else
            res = climbStairs(n-1)+climbStairs(n-2);
        
        cache.put(n,res);
        
        return res;
    }
}