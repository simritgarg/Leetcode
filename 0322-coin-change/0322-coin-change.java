class Solution {
    public int coinChange(int[] coins, int amount) {
        int[][] dp = new int[coins.length][amount+1];
        for(int[] i: dp){
            Arrays.fill(i,-1);
        }
        int result = totalCoins(coins,0,amount,dp);
        return result == Integer.MAX_VALUE ? -1 : result;
    }
    public int totalCoins(int[] coins, int idx, int amount, int[][] dp){
        if(amount==0 )return 0;
        if(idx == coins.length) return Integer.MAX_VALUE;
        if(dp[idx][amount] != -1) return dp[idx][amount];
        int skip = totalCoins(coins,idx+1,amount,dp);
        int pick = Integer.MAX_VALUE;
        if(coins[idx]<=amount){
            int res = totalCoins(coins, idx, amount - coins[idx], dp);
            if (res != Integer.MAX_VALUE) {
                pick = 1 + res; 
            }
        }
        
        dp[idx][amount] = Math.min(pick,skip);
        return dp[idx][amount];
        
    }
}