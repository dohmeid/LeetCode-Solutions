class Solution {
    public String breakPalindrome(String p) {
        
        int n = p.length();
        
        if( n==1 )
            return "";
        
        if(p.charAt(0)!='a')
                return p.substring(0, 0) + 'a' + p.substring(1);
        
         for(int i=0;i<n/2;i++){
                char c = p.charAt(i);
                if(c != 'a'){
                    return p.substring(0, i) + 'a' + p.substring(i+1);
                }
         }
                
            
          
        
        return p.substring(0, n-1) + 'b' + p.substring(n);
        
    }
}