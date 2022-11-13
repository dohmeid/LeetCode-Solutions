class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        String[] s2 = s.split("\\s+"); // (\\s+) is used to match one or more whitespace characters
        
        String res = "";
        for(int i=s2.length-1;i>=0;i--){
                res +=  s2[i] +" ";
        }
        return res.trim();
    }
}