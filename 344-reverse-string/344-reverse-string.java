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
        
        
       /* sol2: using 2 pointers - less time
        for(int i=0;i<s.length/2;i++){
            char c = s[s.length-i-1];
            s[s.length-i-1] = s[i];
            s[i] = c; 
        }
        */
        
        
        //sol3 : using recursion
            rec(s,0);
        
      
    }
    
     public void rec(char[] s,int i) {
            
         if (s == null || i >= s.length/2) {
            return;
         }
         char temp = s[i];
         s[i] = s[s.length-i-1];
         s[s.length-i-1] = temp;
          rec(s,i+1);
          
            
     }   
    
}