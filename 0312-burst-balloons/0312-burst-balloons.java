class Solution {
    public int maxCoins(int[] nums) {
        int[][] dp = new int[nums.length+1][nums.length+1];
        for(int[] t: dp){
            Arrays.fill(t,-1);
        }
        return burst(nums,0,nums.length-1,dp);
    }
    public int burst(int[] nums,int start, int end,int[][] dp){
        if(start> end) return 0;
        int max =0;
        if(dp[start][end]!=-1) return dp[start][end];
        for(int i = start;i<=end;i++){
            int coins = nums[i];
            if(start-1>=0) coins*=nums[start-1];
            if(end+1<nums.length) coins*=nums[end+1];
            int res = coins + burst(nums,start,i-1,dp) + burst(nums,i+1,end,dp);
            max = Math.max(max,res);

        }
        return dp[start][end] = max;


    }
}