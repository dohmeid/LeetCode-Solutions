class Solution {
    public String makeGood(String s) {
       
       Stack<Character> st = new Stack<>();
       for(int i=0;i<s.length();i++){
           char c1 = s.charAt(i);
           if(!st.isEmpty() && Math.abs(st.peek()-c1)==32 ) //(c1+32==st.peek()||st.peek()+32==c1)
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