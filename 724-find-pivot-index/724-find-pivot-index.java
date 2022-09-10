class Solution {
    public int pivotIndex(int[] nums) {
        
        int in= -1;
        
        for(int i=0;i<nums.length;i++){
             int sleft=0;
             int sright=0;
            for(int j=0; j<i ; j++){
                sleft += nums[j];
            }
            
             for(int j=i+1; j<nums.length ; j++){
                sright += nums[j];
            }
            
            if(sleft == sright){
               in = i;
                break;
            }
            
        }
        
        return in;
    }
}