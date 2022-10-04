class Solution {
    public int minCost(String c, int[] t) {
         
        int res=0, i=0;
        while(i<c.length()-1){
           int j=0,sum=t[i] ,max=t[i];
            for(j=i+1; j<c.length();j++){
                if(c.charAt(i)==c.charAt(j)){
                    sum += t[j];
                    max = Math.max(max,t[j]);
                }   
                else
                    break;  
            }
               res += sum - max;
               i=j; 
        }
        return res;
    }
}