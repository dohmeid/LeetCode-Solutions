class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            if(!st.isEmpty() && st.peek()==s.charAt(i))
                st.pop();
            else    
                st.push(s.charAt(i));
        }
        
       StringBuilder res = new StringBuilder();
       while(st.size()!=0)
           res.append( st.pop() );
        
       return res.reverse().toString();
    }
}