class Solution {
    public void reverseString(char[] s) {
    
        /* sol1 : using stack
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length;i++){
            st.push(s[i]);
        }
        
        for(int i=0;i<s.length;i++){
            s[i] = st.pop();
        }
       */
        
       //sol2:
        for(int i=0;i<s.length/2;i++){
            char c = s[s.length-i-1];
            
            s[s.length-i-1] = s[i];
            s[i] = c;
            
            
        }
        
      
    }
}