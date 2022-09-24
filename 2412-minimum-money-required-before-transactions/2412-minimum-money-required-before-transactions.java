class Solution {
    public long minimumMoney(int[][] t) {
       
        long mon = 0, mint=0;
        
        for(int i=0; i<t.length ;i++){
            int cost = t[i][0];
            int cash = t[i][1];
            
            //the last transaction that should be considered to create maximum ans possible
            //also needed for the case when all transactions have cost<cashback
            mint = Math.max(mint, Math.min(cost, cash)); 
            
            //the transactions where cost > cashback
            if(cost-cash>0) 
                mon += cost-cash;
            
        }
        
        return mon+mint;
    }
}



