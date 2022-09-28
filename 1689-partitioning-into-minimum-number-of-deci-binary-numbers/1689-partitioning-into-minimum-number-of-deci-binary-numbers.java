class Solution {
    public int minPartitions(String n) {
        
        int max = 0;
        for(int i=0 ; i<n.length();i++){
            char c = n.charAt(i);
            int num = c - '0'; // Converting character to its integer value
            max = Math.max(max,num);
        }
        return max;
    }
    
  
}