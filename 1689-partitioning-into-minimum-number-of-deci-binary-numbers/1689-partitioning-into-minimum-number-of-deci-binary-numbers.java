class Solution {
    public int minPartitions(String n) {
        
        int max = 0;
        String s = "";
        for(int i=0 ; i<n.length();i++){
            
            char c = n.charAt(i);
            s += c;
            int num = Integer.parseInt(s);
            max = Math.max(max,num);
            s="";
        }
        
        
        
        return max;
    }
    
  
}