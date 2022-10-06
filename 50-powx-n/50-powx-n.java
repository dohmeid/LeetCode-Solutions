class Solution {
    public double myPow(double x, int n) {
        
        //solution1 :easy //return Math.pow(x, n);
        
        //solution2: recursion 
        if(x==1 || n==0)
            return 1;
        if(x==0)
            return 0;
        if(n==1)
            return x;
        
        if(n==Integer.MIN_VALUE && x<0)
            return 1;
        if(n==Integer.MIN_VALUE && x>0)
            return 0;
        if(n==Integer.MAX_VALUE && x<0)
            return -1;
        if(n==Integer.MAX_VALUE && x>0)
            return 0;
        
        if(n>0)
            return helper(x,n);
        else
            return 1/helper(x,n*-1) ;
    }
    
    
    
    public double helper(double x, int n) {
        
        
        
        if(n<=0)
            return 1;
        return x*helper(x,--n) ;
    }
    
}