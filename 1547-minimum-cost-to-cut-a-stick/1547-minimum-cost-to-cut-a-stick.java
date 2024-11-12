class Solution {
    public int minCost(int n, int[] cuts) {
        Arrays.sort(cuts);
        int[][] dp = new int[cuts.length+1][cuts.length+1];
        for(int[] i: dp){
            Arrays.fill(i,-1);
        }
        return CutStick(cuts,0,cuts.length-1,0,n,dp);
        
    }
    public int CutStick( int[] cuts, int i, int j, int start, int end,int[][] dp ) // i,j is starting and ending of array and left and right is starting and ending of stick
    {
        if(i>j) return 0;
        if(dp[i][j]!=-1) return dp[i][j];
        int min = Integer.MAX_VALUE;
        for(int k=i;k<=j;k++){
            int res = end-start + CutStick(cuts,i,k-1,start,cuts[k],dp) + CutStick(cuts,k+1,j,cuts[k],end,dp);
            min = Math.min(res,min);
        }
        return dp[i][j] = min;
    }

}