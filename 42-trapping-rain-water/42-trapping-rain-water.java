class Solution {
    public int trap(int[] height) {
        
        int c=0;
        int leftmax=0,rightmax=0;
        int left=0;
        int right = height.length-1;
       
        while(left < right){
            
            leftmax = Math.max(height[left], leftmax);
            rightmax = Math.max(height[right], rightmax);
			
            if(leftmax < rightmax)
                c += leftmax - height[left++];
            else
                c += rightmax - height[right--];
            
        }  
        
        
        return c;
    }
}