
class Solution {
    public int kthGrammar(int n, double k) {
        
        if(n==1 || k==1)
            return 0;
        
        double prev_size = Math.pow(2,n-1);
        double mid = prev_size/2; //half the prev row
        
        if(k <= mid)
            return kthGrammar(n-1,k);
        else{
            return (kthGrammar( n-1 , k-mid )) ^ 1 ; //get the complement of the result then complement it again
               //^ is the XOR/compplement : 0^1 returns 1 AND 1^1 returns 0
        }
    }   
}