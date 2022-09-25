class Solution {
    public int longestSubarray(int[] nums) {
        
        int res=0;
        int max = nums[0];
        for(int i=1; i<nums.length ; i++){
            if(nums[i]>max)
                max=nums[i];
        }
        
        int temp=0;
        for(int i=0; i<nums.length ; i++){
            if(nums[i]==max){
                temp++;
            }
            else{
                res = Math.max( res, temp);
                temp=0;
            }
                
        }
        
        res = Math.max( res, temp);

       
     
        
        
        return res;
    }
}