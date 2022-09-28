class Solution {
    public int minPartitions(String n) {
        
        int max = 0;
        for(int i=0 ; i<n.length();i++){
          //  int num = c - '0'; // Converting character to its integer value
            max = Math.max(max, n.charAt(i)-'0');
        }
        return max;
    }
    
  
}