class Solution {
    public int finalValueAfterOperations(String[] op) {
        
        int res=0;
        
        for(int i=0;i<op.length;i++){
            
            if(op[i].equals("++X")==true || op[i].equals("X++")==true )
                res++;
            else 
                res--;
        }
        
        return res;
    }
}