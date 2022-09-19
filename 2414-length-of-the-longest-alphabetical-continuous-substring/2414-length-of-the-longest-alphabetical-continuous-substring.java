class Solution {
    public int longestContinuousSubstring(String s) {
        
        int len=1,max=0;
        
        for(int i=0; i<s.length()-1;i++){
           
            if(s.charAt(i)+1 == s.charAt(i+1))
                len++;
            else{
                max  = Math.max(len,max);
                len=1;
            }
            
        }
        max  = Math.max(len,max);
        
      return max;
    }
}