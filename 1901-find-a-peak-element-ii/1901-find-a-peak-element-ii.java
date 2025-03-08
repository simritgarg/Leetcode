class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int row = mat.length;
        int col = mat[0].length;
        int low = 0;
        int high = mat[0].length-1;
        while(low<=high){
            int mid = low + (high-low)/2; // col
            int maxEle = findMax(mat,row,col,mid); // row
            int left = mid-1 >= low ? mat[maxEle][mid-1] : -1;
            int right = mid+1 < high ? mat[maxEle][mid+1] : -1;
            if(mat[maxEle][mid] > left && mat[maxEle][mid] > right) return new int[]{maxEle,mid};
            else if(mat[maxEle][mid] < left) high = mid-1;
            else low = mid+1;
        }
        return new int[] {-1,-1};

    }
    public int findMax(int[][] mat, int n, int m, int col){
        int maxValue = -1;
        int row = -1;
        for(int i=0;i<n;i++){
            if(maxValue < mat[i][col]){
                maxValue = mat[i][col];
                row = i;
            }
        }
        return row;
    }
}