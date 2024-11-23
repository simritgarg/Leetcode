class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int value = image[sr][sc];
        if(value==color) return image;
        dfs(sr,sc,image,value,color);
        return image;
    }
    public void dfs(int i, int j, int[][] grid, int value, int color){
        if(i<0 || j<0 || i>=grid.length || j>= grid[0].length || grid[i][j] != value) return;
        grid[i][j] = color;
        dfs(i-1,j,grid,value,color);
        dfs(i,j+1,grid,value,color);
        dfs(i+1,j,grid,value,color);
        dfs(i,j-1,grid,value,color);
        
    }
}