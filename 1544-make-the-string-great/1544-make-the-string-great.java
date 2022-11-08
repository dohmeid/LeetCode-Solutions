class Solution {
    public String makeGood(String s) {
       
       Stack<Character> st = new Stack<>();
       st.push(s.charAt(0));
        
       for(int i=1;i<s.length();i++){
           char c1 = s.charAt(i);
           if(st.isEmpty()==false && (c1+32==st.peek() || st.peek()+32==c1 ) )
               st.pop();
           else
               st.push(c1);
      }    
       
       StringBuilder res = new StringBuilder();
       while(st.size()!=0)
           res.append( st.pop() );
       return res.reverse().toString();
    }
}