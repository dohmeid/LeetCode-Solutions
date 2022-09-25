class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        int len = heights.length;
        
        for(int i=0 ; i<len ; i++){        
            
            for(int j=i+1;j<len ; j++ ){
                
                if(heights[i]<heights[j]){ //switch
                    int temp = heights[i];
                    heights[i] = heights[j];
                    heights[j]= temp;
                    
                    String n = names[i];
                     names[i] =  names[j];
                      names[j] =  n;
                }
            }
            
            
        }
        
        
        return names;
    }
}