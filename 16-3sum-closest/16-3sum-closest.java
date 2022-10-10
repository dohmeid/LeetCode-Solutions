class Solution {
    public int threeSumClosest(int[] nums, int target) {
        /* solution1 :  brute force solution : time limit exceeded
        int n=nums.length , diff =9000 ,  res=0;
        for(int i=0 ; i<n-2 ;i++){
            for(int j=i+1 ; j<n ;j++){
                for(int k=j+1; k<n ;k++){
                    int sum = nums[i]+nums[j]+nums[k];
                    if( Math.abs(target-sum) < Math.abs(diff)   ){
                        diff = target-sum;
                        res = sum;
                    }
                }
            }
        }
        return res;
        */
        
        //solution2 : using 2 pointers
        int n=nums.length , diff =9000 ,  res=0;
        Arrays.sort(nums); //sorting the array is needed to move the pointers up or down
        
        for( int i=0 ; i<n ; i++ ){
            int lindex = i+1; //left index
            int rindex = n-1; //right index 
            
            while( lindex < rindex ){
                int sum = nums[i] + nums[lindex] + nums[rindex];
                if(Math.abs(target-sum) < Math.abs(diff)){
                    diff = target-sum;
                    res = sum;
                }
                if(sum == target)
                    return target;
                else if(sum>target)
                    rindex--;
                else
                    lindex++; 
                
            }  
        }
        
        return res;
    }
    
}