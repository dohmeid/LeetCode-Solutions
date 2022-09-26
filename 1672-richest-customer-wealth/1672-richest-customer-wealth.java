class Solution {
    public int maximumWealth(int[][] a) {
        
        int max=0;
        for(int i=0; i<a.length ;i++){
            int m=0;
            for(int j=0; j<a[0].length ;j++){
                m += a[i][j];
            }
            max = Math.max(max,m);
        }
        
        return max;
    }
}