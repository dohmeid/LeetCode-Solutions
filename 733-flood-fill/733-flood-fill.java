class Solution {
    int [][] visited = new int[50][50];  
    int flag=0;
    int old_color=0;
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        
        if(flag==0){
            old_color = image[sr][sc];
            flag=1;
        }
        
        if(sc<image[0].length && sc>=0 && sr<image.length && sr>=0 && image[sr][sc]==old_color && visited[sr][sc]!=1){
    
            image[sr][sc] = color;
            visited[sr][sc]=1; //to avoid infinit loops -_-
         
            image = floodFill(image,sr,sc+1,color);
            image = floodFill(image,sr,sc-1,color);
            image = floodFill(image,sr+1,sc,color);
            image = floodFill(image,sr-1,sc,color);
        
        }
        
        return image;
    }
    
    
    
}

/* better solution

class Solution {
    
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        
        int old_color = image[sr][sc];
        if(old_color == color)
            return image;
       
        dfs(image, sr, sc, old_color, color);
        
        return image;
    }
    
    private void dfs(int[][] image, int sr, int sc, int old_color, int new_color){
        if(sc<image[0].length && sc>=0 && sr<image.length && sr>=0 && image[sr][sc]==old_color ) {
            image[sr][sc] = new_color;
            dfs(image,sr, sc+1, old_color, new_color);
            dfs(image,sr, sc-1, old_color, new_color);
            dfs(image,sr+1, sc, old_color, new_color);
            dfs(image,sr-1, sc, old_color, new_color);
        }
    }
    
    
}

*/