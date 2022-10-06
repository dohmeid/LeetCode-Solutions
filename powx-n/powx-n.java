//solution1 :easy //return Math.pow(x, n);

class Solution { //solution2: recursion 
    public double myPow(double x, int n) {
        
        //corner cases for optimization 
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
        if(n==0)
            return 1;
        else if(n%2==0)
            return helper(x*x,n/2);
        else 
            return x*helper(x,--n) ;
    }
    
}