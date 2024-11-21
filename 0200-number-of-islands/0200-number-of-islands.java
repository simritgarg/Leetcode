class Solution {
    public int dfs(int i, int j, char[][] grid){
        if(i<0 || j<0 || i>=grid.length || j>= grid[0].length || grid[i][j] != '1') return 0;
        grid[i][j] = 0;
        int top = dfs(i-1,j,grid);
        int right = dfs(i,j+1,grid);
        int bottom = dfs(i+1,j,grid);
        int left = dfs(i,j-1,grid);
        return 1;
        
    }
    public int numIslands(char[][] grid) {
        int count = 0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]=='1'){
                    dfs(i,j,grid);
                    count++;
                }
            }
        }
        return count;
        
    }
}