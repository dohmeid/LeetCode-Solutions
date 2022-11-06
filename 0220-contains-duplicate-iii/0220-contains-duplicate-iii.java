class Solution {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int indexDiff, int valueDiff) {
        
        int n = nums.length;
        for(int i=0;i<n-1;i++){
            int nn = indexDiff+i;
            for(int j=i+1; j<n&&j<=nn;j++){
                if(Math.abs(nums[i]-nums[j]) <= valueDiff )
                    return true;
            }
            
            
        }
        
        
        
        return false;
    }
}