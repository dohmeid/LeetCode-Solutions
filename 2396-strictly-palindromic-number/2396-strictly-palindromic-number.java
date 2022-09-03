class Solution {
    public boolean isStrictlyPalindromic(int n) {
        
        for(int b=2; b<=n-2; b++){
            int num=n;
            String s = "";
            while(num>0){
                s += num%b; 
                num /= b;
            }
            String ss = "";
           //for (int i=0; i<s.length(); i++) //no need to reverse string '_'
               // ss += s.charAt(i);
             for (int i=0; i<s.length(); i++) {
               if(i!=(s.length()/2) && s.charAt(i) != s.charAt(s.length()-1-i) )
                        return false;
             }
        }
       
        return true;
    }
}