class Solution {
    public int longestContinuousSubstring(String s) {
        
        int len=1,max=0;
        
        for(int i=0; i<s.length()-1;i++){
            char c1 =  (s.charAt(i));
            char c2 = (s.charAt(i+1));
            int n1 = c1;
            int n2 = c2;
            if(n1+1 == n2){
                len++;
            }
            else{
                max  = Math.max(len,max);
                len=1;
            }
            
        }
        max  = Math.max(len,max);
        
      return max;
    }
}