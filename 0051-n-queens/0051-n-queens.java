class Solution {
    public static boolean isSafe(char[][] mat, int row, int col){
            for(int i = row-1;i>=0;i--){
                if(mat[i][col] == 'Q') return false;
            }
            //diagonal
            for(int i = row-1, j= col-1;i>=0 && j>=0;i--,j--){
                if(mat[i][j] == 'Q') return false;
            }
            // anti- diagonal
            for(int i = row-1, j=col+1;i>=0 && j<mat[0].length;i--,j++){
                if(mat[i][j] == 'Q') return false;
            }
            return true;
        }
        public static void nQueens(int n, char[][] mat, int row, List<List<String>> res ){
            if(row == n){
                List<String> temp = new ArrayList<>();
                for(int i=0;i<n;i++){
                    String str = "";
                    for(int j=0;j<mat[0].length;j++){
                        str += mat[i][j];
                    }
                    temp.add(str);
                }
                res.add(temp);
            }
            for(int j=0;j<mat[0].length;j++){
                if(isSafe(mat,row,j)){
                    mat[row][j] = 'Q';
                    nQueens(n,mat,row+1,res);
                    mat[row][j] = '.';
                }
            }

        }
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> res = new ArrayList<>();
        char[][] mat = new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<mat[0].length;j++){
                mat[i][j] = '.';
            }
        }
        nQueens(n,mat,0,res);
        return res;
    }

};