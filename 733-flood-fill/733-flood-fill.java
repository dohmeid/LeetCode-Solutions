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