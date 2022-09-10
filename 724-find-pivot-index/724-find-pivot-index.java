class Solution {
    public int pivotIndex(int[] nums) {
        int in= -1;  
        
       /*  solution 1
        for(int i=0;i<nums.length;i++){
            int sleft=0, sright=0;
            for(int j=0; j<i ; j++)
                sleft += nums[j];
            for(int j=i+1; j<nums.length ; j++)
                sright += nums[j];
            
            if(sleft == sright){
               in = i;
                break;
            }
        }
        */
        
        //solution 2 - better than 1
        int sum=0;
        for(int i=0;i<nums.length;i++)
            sum += nums[i];
        
        int sleft=0;
        for(int i=0;i<nums.length;i++){
            if(sleft == sum - nums[i] - sleft){
               in = i;
                break;
            }
            else
                sleft += nums[i];
        }
        
        
        return in;
    }
}