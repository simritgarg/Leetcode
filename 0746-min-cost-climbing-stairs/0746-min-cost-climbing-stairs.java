class Solution {

    //MEMOIZATION
    // public int minCostClimbingStairs(int[] cost) {
    //     int n = cost.length;
    //     int[] dp = new int[n];
    //     Arrays.fill(dp, -1);
    //     return Math.min(minCost(cost, n - 1, dp), minCost(cost, n - 2, dp));
        
    // }
    // public int minCost(int[] cost, int index, int[] dp) {
    //     if (index < 0) return 0; 
    //     if (dp[index] != -1) return dp[index]; 
    //     dp[index] = cost[index] + Math.min(minCost(cost, index - 1, dp), minCost(cost, index - 2, dp));
    //     return dp[index];

    // }

    //TABULATION
    // public int minCostClimbingStairs(int[] cost) {
    // int n = cost.length;
    // int[] dp = new int[n + 1];
    // dp[0] = 0;
    // dp[1] = 0; 
    
    // for (int i = 2; i <= n; i++) {
    //     dp[i] = Math.min(dp[i - 1] + cost[i - 1], dp[i - 2] + cost[i - 2]);
    // }
    // return dp[n]; 
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        return Math.min(minCost(n-1,cost,dp),minCost(n-2,cost,dp));
    }
    public int minCost(int n, int[] cost, int[] dp){
        if(n<0) return 0;
        if(dp[n]!=-1) return dp[n];
        dp[n] = cost[n] + Math.min(minCost(n-1,cost,dp),minCost(n-2,cost,dp));
        return dp[n];
    }

}
