class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int res=0;
        Set<Character> s = new HashSet<>();    
        for(int i=0; i<jewels.length();i++)
            s.add(jewels.charAt(i));

        for(int i=0; i<stones.length();i++){
            if(s.contains(stones.charAt(i)))
                res++;
        }
        
        return res;
    }
}