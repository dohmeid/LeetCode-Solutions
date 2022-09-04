class Solution {
    public boolean checkDistances(String s, int[] distance) {
        
        char[] chars = {'a', 'b', 'c', 'd', 'e', 'f'
            , 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        Set<Character> hashSet = new HashSet<>(); 
        int j=0;
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if (hashSet.contains(c) == false) {
                hashSet.add(c);
                for(int k=0;k<chars.length;k++){
                    if(c == chars[k] ){
                        j=k;
                        break;
                    }
                }
                int d = distance[j] +1+i ;
                if(d>=s.length()) 
                    return false;
                if(c != s.charAt(d) )
                    return false;
            }
        }
       return true; 
    }
}