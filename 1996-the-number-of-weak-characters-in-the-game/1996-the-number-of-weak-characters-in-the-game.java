class Solution {
    public int numberOfWeakCharacters(int[][] properties) {
        
        int rows = properties.length;
        int w=0;
        
         //Arrays.sort(properties, 0, );
         Arrays.sort(properties, (a,b) -> (a[0]!=b[0]) ? b[0]-a[0] : a[1]-b[1]);
         
         int max=0;
         for(int i=0;i<rows;i++){
             if(properties[i][1] < max)
                 w++;
             else
                 max = properties[i][1];
         }
        
        return w;
    }
}