class Solution {
    public int[] findErrorNums(int[] nums) {
        int [] res = new int [2];
        Set<Integer> set = new HashSet<>();  
        
        for(int i=0 ; i<nums.length ;i++ ){
            if(!set.contains(nums[i]))
                set.add(nums[i]);
            else
                res[0] = nums[i];  
        }
       
        int n = 1;
       while(n<=nums.length){
             if(!set.contains(n)){
                 res[1] = n;
                 break;
             }   
            n++;
        }
        
        return res;
    }
}