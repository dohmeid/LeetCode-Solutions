class Solution {
    public String reverseWords(String s) {

        String[] s2 = s.trim().split(" +"); // (\\s+) is used to match one or more whitespace characters
        
        /*
        String res = "";
        for(int i=s2.length-1;i>=0;i--){
                res +=  s2[i] +" ";
        }
        return res.trim();
        */
        Collections.reverse(Arrays.asList(s2));
        return String.join(" ",s2);
        
    }
}