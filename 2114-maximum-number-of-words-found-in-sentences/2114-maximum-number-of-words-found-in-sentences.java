class Solution {
    public int mostWordsFound(String[] s) {
        
        int max=0;
        
        for(int i=0; i<s.length ; i++){
            
            String sen = s[i];
            String[] words = sen.split("\\s+"); //This solution uses the regular expression "\\s+" to split the string on whitespace.
            max = Math.max(max, words.length);
            
            
        }
        
        
        
        
        return max;
    }
}