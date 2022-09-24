class Solution {
    public long minimumMoney(int[][] t) {
       
        long mon = 0, mint=0;
        
        for(int i=0; i<t.length ;i++){
            int cost = t[i][0];
            int cash = t[i][1];
            
            mint = Math.max(mint, Math.min(cost, cash));
            if(cost-cash>0)
                mon += cost-cash;
            
        }
        
        return mon+mint;
    }
}



