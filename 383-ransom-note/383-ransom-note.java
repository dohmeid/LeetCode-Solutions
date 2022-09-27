class Solution {
    public boolean canConstruct(String rn, String m) {
       
        Map<Character, Integer> m2 = new HashMap<>();

        for(int i=0; i<m.length();i++){
            char c = m.charAt(i);
             if (!m2.containsKey(c))
                 m2.putIfAbsent(c, 1); //key = char , value=frequancy of the char
            else{
                int v = m2.get(c);
                m2.put(c, ++v);
            }   
        }
        
        for(int i=0; i<rn.length();i++){
            char c = rn.charAt(i);
            if (!m2.containsKey(c))
                return false;
            
            int v = m2.get(c);
            if(v==0)
                return false;
            m2.put(c, --v);
        }
        
        return true;
    }
}


  /*    for (Map.Entry<Character, Integer> entry : m1.entrySet()) {
            char c = entry.getKey();
            int val = entry.getValue();
            if(!m2.containsKey(c) || m2.get(c)<val)
                return false;
            
        }*/