class Solution {
    public int paintWalls(int[] cost, int[] time) {
        int[][] dp = new int[cost.length+1][cost.length+1];
        for(int[] t: dp){
            Arrays.fill(t,-1);
        }
        return ways(cost,time,0,cost.length,dp);
    
        
    }
    public int ways(int[] cost, int[] time, int index, int walls, int[][] dp){
        // Base conditions
        if(walls<=0) return 0;
        if(index==cost.length) return (int)1e9;

        // check whether ele is in dp or not
        if(dp[index][walls] != -1) return dp[index][walls];

        int pick = cost[index] + ways(cost,time,index+1,walls-(time[index]+1),dp);
        int skip = ways(cost,time,index+1,walls,dp);

        dp[index][walls] = Math.min(pick,skip);
        return dp[index][walls];

    }
}