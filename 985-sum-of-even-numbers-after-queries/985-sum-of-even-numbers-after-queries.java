class Solution {
    public int[] sumEvenAfterQueries(int[] nums, int[][] q) {
        
        int[] sum = new int [nums.length];
        int even=0;
        for(int i=0; i<nums.length ;i++){
            if(nums[i]%2==0)
                even+= nums[i];
        }
        
        for(int i=0; i<q.length ; i++){
            
            int val = q[i][0];
            int index = q[i][1];
            int old = nums[index];
            nums[index] += val;
            if(nums[index]%2!=0 && old%2==0)
               even -= old; 
            else if(nums[index]%2!=0 && old%2!=0){
                 sum[i] = even;
                 continue;   
            }
            else if (nums[index]%2==0 && old%2!=0 ) 
                even += nums[index];
            else{ 
                even -= old; 
                even += nums[index];
            }
            
            sum[i] = even;
            
        }
        
        
        return sum;
    }
}


/*
     j
     0 1
 i   ---
 0   1 0
 1  -3 1
 2  -4 0
 3   2 3

nums[0] += q[][]

*/