class Solution {
    public int mostWordsFound(String[] s) {
        
        int max=0;
        for(int i=0; i<s.length ; i++){
            String[] words =  s[i].split(" "); 
            max = Math.max(max, words.length);
        }        
        return max;
    }
}