class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int[] dp1 = new int[cost.length];
        Arrays.fill(dp1,-1);
        int[] dp2 = new int[cost.length];
        Arrays.fill(dp2,-1);
        return Math.min(totalCost(cost,0,dp1),totalCost(cost,1,dp2));
    }
    public int totalCost(int[] cost, int idx, int[] dp){
        // base case
        if(idx >= cost.length) return 0;
        if(dp[idx]!=-1) return dp[idx];
        int pick = cost[idx] + totalCost(cost,idx+2,dp);
        int skip = cost[idx] + totalCost(cost,idx+1,dp);
        return dp[idx] = Math.min(pick,skip);
    }
}