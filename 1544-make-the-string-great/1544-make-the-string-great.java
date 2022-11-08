class Solution {
    public String makeGood(String s) {
        if(s=="" || s.length()==1)
            return s;
       Stack<Character> st = new Stack<>();
       st.push(s.charAt(0));
        
       for(int i=1;i<s.length();i++){
           char c1 = s.charAt(i);
           if(st.isEmpty())
               st.push(c1);
           else if(c1+32==st.peek() || st.peek()+32==c1 )
               st.pop();
           else
               st.push(s.charAt(i));
      }    
       if(st.size()==0)
               return "";
       StringBuilder res = new StringBuilder();
       while(st.size()!=0){
           res.append( st.pop() );
       }
         
        return res.reverse().toString();
    }
}