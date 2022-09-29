class Solution {
    public List<Boolean> kidsWithCandies(int[] c, int exc) {
        List<Boolean> res = new ArrayList<>() ;
        int max=0;
        for(int i=0;i<c.length ; i++){
            max  = Math.max(max,c[i]);
        }
        
        for(int i=0;i<c.length ; i++){
               res.add(c[i]+exc >= max);
        }
        
        return res;
    }
}