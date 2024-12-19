class Solution {
    public int numIslands(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int count =0;
        boolean[][] vis = new boolean[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(!vis[i][j] && grid[i][j] == '1'){
                    dfs(grid,vis,i,j);
                    count++;
                }
            }
        }
        return count;
    }
    public void dfs(char[][] grid, boolean[][] vis, int i, int j){
        if(i<0 || j<0 || i>=grid.length || j>=grid[0].length || grid[i][j] == '0'|| vis[i][j]) return;
        vis[i][j] = true;
        dfs(grid,vis,i-1,j);
        dfs(grid,vis,i,j+1);
        dfs(grid,vis,i+1,j);
        dfs(grid,vis,i,j-1);
    }
}