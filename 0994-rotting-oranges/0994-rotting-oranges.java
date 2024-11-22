class Solution {
    public int orangesRotting(int[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 2) {
                    dfs(i, j, grid, 2); 
                }
            }
        }

        
        int max=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1) return -1;
                max = Math.max(max,grid[i][j]);
            }
        }
        return max==0?0:max-2;
        
    }
    public void dfs(int i, int j, int[][] grid, int time){
        if(i<0 || j<0 || i>=grid.length || j>= grid[0].length || grid[i][j] ==0 || grid[i][j] >2 && grid[i][j]<time ) return;
        grid[i][j] = time;
        dfs(i-1,j,grid,time+1);
        dfs(i,j+1,grid,time+1);
        dfs(i+1,j,grid,time+1);
        dfs(i,j-1,grid,time+1);
        return;
        
    }
}
