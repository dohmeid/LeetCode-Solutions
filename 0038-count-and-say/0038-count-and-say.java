class Solution {
    String res = "";
    public String countAndSay(int n) {
        
      /*  if(n==1)
            return "1";
        if(n==2)
            return "11";
        
        String res = countAndSay(n-1);
        HashMap<Character, Integer> m = new HashMap<Character, Integer>();
        
        for(int i=0;i<res.length();i++){
            char c  = res.charAt(i);
            if(!m.containsKey(c))
                m.put(c,1);
            else{
                int val = m.get(c); 
                m.put(c,++val);
            }
            
        }
        
        String res2 = "";
        for (Map.Entry<Character, Integer> entry : m.entrySet()) {
            char c = entry.getKey();
            int val = entry.getValue();
            res2 += String.valueOf(val) + c;   
        }

*/
       
        helper(1,n);
        return res;
        
    }
    
    
     public void helper(int start, int end) {
         if(start>end)
             return ; 
         if(start==1)
             res = "1";
         else if(start==2)
             res = "11";
         else{
            StringBuilder sb = new StringBuilder();
            int count=1;
            for(int i=0;i<res.length()-1;i++){
                char c1  = res.charAt(i);
                char c2  = res.charAt(i+1);
                if(c1==c2){
                    count++;
                }
                else{
                    sb.append(count);
                    sb.append(c1);
                    count=1;
                }
            }
             sb.append(count);
             sb.append(res.charAt(res.length()-1));
            res = sb.toString();
            
        }  
      
         helper(start+1,end);
     }
    
    
    
    
}