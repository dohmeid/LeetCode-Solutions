class Solution {
    public int smallestEvenMultiple(int n) {
        
        for(int i=1; i<Integer.MAX_VALUE ; i++){
            if(i%2==0 && i%n==0)
                return i;
        }
        
       return 0; 
    }
}