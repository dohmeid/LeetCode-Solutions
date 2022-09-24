class Solution {
    int [][] visited = new int[50][50];  
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        
        if( visited[sr][sc]!=1){
        
        int old_color = image[sr][sc];
        image[sr][sc] = color;
        visited[sr][sc]=1; //to avoid infinit loops -_-
       
        
        if(sc+1<image[0].length && image[sr][sc+1] == old_color)
            image = floodFill(image,sr,sc+1,color);
        if(sc-1>=0 && image[sr][sc-1] == old_color)
            image = floodFill(image,sr,sc-1,color);
        
        if(sr+1<image.length  && image[sr+1][sc] == old_color)
            image = floodFill(image,sr+1,sc,color);
        if( sr-1>=0 && image[sr-1][sc] == old_color)
            image = floodFill(image,sr-1,sc,color);
        
        }
        
        return image;
    }
}