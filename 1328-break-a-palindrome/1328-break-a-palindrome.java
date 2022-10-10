class Solution {
    public String breakPalindrome(String p) {
        int n = p.length();
        if( n==1 )
            return "";
        if(p.charAt(0)!='a')
                return p.substring(0, 0) + 'a' + p.substring(1);
        for(int i=0;i<n/2;i++){
                char c = p.charAt(i); // if not a then change it to be lexographically smallest
                if(c != 'a'){
                    return p.substring(0, i) + 'a' + p.substring(i+1);
                }
         }       
        // if we reach here, there are ONLY 'a' in palindrome string, so we should change the last character to a b
        return p.substring(0, n-1) + 'b' + p.substring(n);
    }
}