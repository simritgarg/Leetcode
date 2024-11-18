class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int[] dp = new int[n];
        Arrays.fill(dp, -1);
        return Math.min(minCost(cost, n - 1, dp), minCost(cost, n - 2, dp));
        
    }
    public int minCost(int[] cost, int index, int[] dp) {
        if (index < 0) return 0; 
        if (dp[index] != -1) return dp[index]; 
        dp[index] = cost[index] + Math.min(minCost(cost, index - 1, dp), minCost(cost, index - 2, dp));
        return dp[index];

    }
}