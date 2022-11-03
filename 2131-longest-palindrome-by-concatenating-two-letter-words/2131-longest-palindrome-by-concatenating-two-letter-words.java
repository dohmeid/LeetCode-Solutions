class Solution {
    public int longestPalindrome(String[] words) {
        
        Map<String, Integer> map = new HashMap<>();  
        int res=0,flag=0;
        for(String s : words){
            String rev = "" + s.charAt(1) + s.charAt(0); 
            if(map.containsKey(rev)){
                res += 4;
                map.put(rev, map.get(rev) - 1);
                if(map.get(rev)==0)
                    map.remove(rev);   
            }
            else{
                int val = map.getOrDefault(s, 0) + 1;
                map.put(s, val);
            }
        }
        
        
        for (Map.Entry<String, Integer> w : map.entrySet()) {
            String s = w.getKey() ;
            int val = w.getValue();
            if(val!=0 && s.charAt(0)==s.charAt(1)){
                res += 2;
                break;
            }
        }
        
        
        
        return res;
    }
}