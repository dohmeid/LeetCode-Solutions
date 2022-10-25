class Solution {
    public boolean arrayStringsAreEqual(String[] w1, String[] w2) {
        String res1 = "";
        String res2 = "";
        for(int i=0 ; i<w1.length; i++)
            res1 += w1[i];
        for(int i=0 ; i<w2.length; i++)
            res2 += w2[i];
        if(res1.equals(res2))
            return true;
        return false;
    }
}