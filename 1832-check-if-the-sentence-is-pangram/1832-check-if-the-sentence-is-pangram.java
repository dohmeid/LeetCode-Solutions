class Solution {
    public boolean checkIfPangram(String s) {
        Set<Character> set = new HashSet<>();  
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            set.add(c);
        }
        
        return (set.size()==26);
    }
}