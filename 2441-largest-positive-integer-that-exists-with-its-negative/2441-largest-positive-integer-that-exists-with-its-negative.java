class Solution {
    public int findMaxK(int[] nums) {
     Arrays.sort(nums);   
     int start = 0;
     int end = nums.length-1;
     
     while(end > start){
         if( (-1*nums[start]) ==nums[end])
             return nums[end];
         else if((-1*nums[start]) > nums[end]  )
             start++;
         else if ((-1*nums[start]) < nums[end]  )
             end--;  
     }  
            
        return -1;
    }
}