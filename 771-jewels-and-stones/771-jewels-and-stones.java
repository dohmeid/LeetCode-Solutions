class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        
        int res=0;
        Set<Character> s = new HashSet<>();     

        for(int i=0; i<jewels.length();i++){
            char c = jewels.charAt(i);
            s.add(c);
        }
        
        for(int i=0; i<stones.length();i++){
            char c = stones.charAt(i);
            if(s.contains(c))
                res++;
        }
        
        return res;
    }
}