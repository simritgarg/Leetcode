class Solution {
    public int dfs(int i, int j, int[][] grid){
        if(i<0 || j<0 || i>=grid.length || j>= grid[0].length || grid[i][j] != 1) return 0;
        grid[i][j] = 0;
        int area = 1;
        area += dfs(i-1,j,grid);
        area += dfs(i,j+1,grid);
        area += dfs(i+1,j,grid);
        area += dfs(i,j-1,grid);
        return area;
        
    }
    public int maxAreaOfIsland(int[][] grid) {
        int max = 0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    int area = dfs(i,j,grid);
                    max = Math.max(max,area);
                    
                }
            }
        }
        return max;
        
    }
}