class Solution {
    public boolean canConstruct(String rn, String m) {
        
        Map<Character, Integer> m1 = new HashMap<>();
        Map<Character, Integer> m2 = new HashMap<>();
        
        for(int i=0; i<rn.length();i++){
            char c = rn.charAt(i);
             if (!m1.containsKey(c))
                 m1.putIfAbsent(c, 1); //key = char , value=frequancy of the char
            else{
                int v = m1.get(c);
                m1.put(c, ++v);
            }   
            
        }
        
        for(int i=0; i<m.length();i++){
            char c = m.charAt(i);
             if (!m2.containsKey(c))
                 m2.putIfAbsent(c, 1); //key = char , value=frequancy of the char
            else{
                int v = m2.get(c);
                m2.put(c, ++v);
            }   
            
        }
        
        for (Map.Entry<Character, Integer> entry : m1.entrySet()) {
            char c = entry.getKey();
            int val = entry.getValue();
            if(!m2.containsKey(c) || m2.get(c)<val)
                return false;
            
        }
        
        
        return true;
    }
}