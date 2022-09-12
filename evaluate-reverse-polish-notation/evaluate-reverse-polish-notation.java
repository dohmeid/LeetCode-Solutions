class Solution {
    public int evalRPN(String[] tokens) {
        
        if(tokens.length == 0)
            return 0;
        if(tokens.length == 1)
            return Integer.parseInt(tokens[0]);
        
        
        Stack<Integer> s = new Stack<Integer>();
        int res=0,flag=0;
        
        for(int i=0; i<tokens.length ; i++){
            
            if(tokens[i].equals("+")==false && tokens[i].equals("-")==false && tokens[i].equals("*")==false  && tokens[i].equals("/")==false ){
                s.push(Integer.parseInt(tokens[i]));
            }
            
            else{
                String str = tokens[i];
                int x = s.pop();
                int y = s.pop();
                switch (str) {
                  case "+":
                        res = x+y; 
                        break;
                  case "-": 
                        res =  y-x; 
                        break;
                  case "*":
                        res = x*y; 
                        break;
                  case "/":
                        res = y / x; 
                        break;
                }
             s.push(res);
        }
            
        }
        
      return res;  
    }
    
}