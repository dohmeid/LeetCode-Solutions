class Solution {
    public String reverseWords(String s) {
        
        String news = "";
        Stack<Character> st = new Stack<Character>();

        
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            
            if(c!=' ')
                st.push(c);
            
            else{
                while(!st.isEmpty()){
                    news += st.pop();
                }
                news += " ";
            }
            
        }
         while(!st.isEmpty()){
                    news += st.pop();
        }
        
       return news; 
    }
}