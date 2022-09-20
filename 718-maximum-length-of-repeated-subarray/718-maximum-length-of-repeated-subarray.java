class Solution {
    public int findLength(int[] nums1, int[] nums2) {
        
        int max=0;
        //sliding window
        for(int i=0; i<nums2.length; i++){
            int len=0,k = i,j=0;
            while(j<nums1.length && k<nums2.length){
                if(nums2[k++] == nums1[j++]){
                    len++;
                    max  = Math.max(len,max);  
                }
                else
                    len=0;
            }
               max  = Math.max(len,max);     
        }
        
        for(int i=0; i<nums1.length; i++){
            int len=0,k = i,j=0;
            while(j<nums2.length && k<nums1.length){
                if(nums1[k++] == nums2[j++]){
                    len++;
                    max  = Math.max(len,max);  
                }
                else
                    len=0;
            }
               max  = Math.max(len,max);     
        }
        
        return max;
    }
}