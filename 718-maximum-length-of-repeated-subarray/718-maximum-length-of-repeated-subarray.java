class Solution {
    public int findLength(int[] nums1, int[] nums2) {
        
        int max=0;
        
        for(int i=0; i<nums2.length; i++){
            int len=0;
            int k = i;
            int j=0;
            while(j<nums1.length && k<nums2.length){
                if(nums2[k++] == nums1[j++]){
                    len++;
                    max  = Math.max(len,max);  
                }
                else
                    len=0;
            }
                   /* int l=j;
                    for(int k=i+1; k<nums2.length; k++){
                        if(l<nums1.length-1 && nums2[k] == nums1[++l]){
                            len++;
                            max  = Math.max(len,max);
                        }
                        else{
                            max  = Math.max(len,max);
                            len=0;
                           
                            break;
                        }
                    }*/
                     
             
               max  = Math.max(len,max);     
            }
        
        for(int i=0; i<nums1.length; i++){
            int len=0;
            int k = i;
            int j=0;
            while(j<nums2.length && k<nums1.length){
                if(nums1[k++] == nums2[j++]){
                    len++;
                    max  = Math.max(len,max);  
                }
                else
                    len=0;
            }
                   /* int l=j;
                    for(int k=i+1; k<nums2.length; k++){
                        if(l<nums1.length-1 && nums2[k] == nums1[++l]){
                            len++;
                            max  = Math.max(len,max);
                        }
                        else{
                            max  = Math.max(len,max);
                            len=0;
                           
                            break;
                        }
                    }*/
                     
             
               max  = Math.max(len,max);     
            }
        
        
        
        
            return max;
        }
}