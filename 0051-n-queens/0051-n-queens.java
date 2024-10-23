class Solution {
    private List<List<String>> result;
    private boolean isSafe(int[][]matrix,int r,int c){
        for(int i=r-1;i>=0;i--){
            if(matrix[i][c]==1)return false;
        }
        for(int i=r-1,j=c-1;i>=0 && j>=0; i--,j--){
            if(matrix[i][j]==1)return false;
        }
        for(int i=r-1,j=c+1;i>=0 && j<matrix[0].length; i--,j++){
            if(matrix[i][j]==1)return false;
        }
        return true;
    }
    private void sol(int n,int[][] matrix,int r,int c){
        if(r==n){
            addBoard(matrix);
            return;
        }
        for(int i=0;i<n;i++){
            if(isSafe(matrix,r,i))
            {
                matrix[r][i]=1;
                sol(n,matrix,r+1,i);
                matrix[r][i]=0;
            }
        }
    }
    public void addBoard(int[][]matrix){
        int n = matrix.length;
        List<String> temp = new ArrayList<>();
        for(int i=0;i<n;i++){
            String str ="";
            for(int j=0;j<n;j++){
                if(matrix[i][j]==0)str+=".";
                else str+="Q";
            }
            temp.add(str);
        }
        result.add(temp);
    }
    public List<List<String>> solveNQueens(int n) {
        int[][]matrix = new int[n][n];
        result=new ArrayList<>();
        sol(n,matrix,0,0);
        return result;
    }
}