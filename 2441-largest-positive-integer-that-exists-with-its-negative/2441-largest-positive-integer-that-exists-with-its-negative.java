/* sol1 : 2 pointers
class Solution {
    public int findMaxK(int[] nums) {
     Arrays.sort(nums);   
     int start = 0;
     int end = nums.length-1;
     
     while(nums[end]>0 && nums[start]<0){
         if( (-1*nums[start]) ==nums[end])
             return nums[end];
         else if((-1*nums[start]) > nums[end]  )
             start++;
         else if ((-1*nums[start]) < nums[end]  )
             end--;  
     }  
            
        return -1;
    }
} */

class Solution {
    public int findMaxK(int[] nums) {
        Arrays.sort(nums);   
        Set<Integer> hashSet = new HashSet<>();   
        for(int i=0 ; i<nums.length ; i++)
            hashSet.add(nums[i]);
        
        for(int i=0 ; i<nums.length ; i++){
             if (hashSet.contains( -1*nums[i] )) 
                 return -1*nums[i]; 
            if(nums[i]>0)
                break;
        }
        return -1;
    }
}