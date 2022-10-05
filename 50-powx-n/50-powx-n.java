class Solution {
    public double myPow(double x, int n) {
        
        return Math.pow(x, n);
    }
}   
        
        /*
        if(n>=0)
            return helper(x,n);
        else
            return 1/helper(x,n*-1) ;
    }
    
    public double helper(double x, int n) {
        if(n==0)
            return 1;
        return x*myPow(x,--n) ;
    }
    
}*/