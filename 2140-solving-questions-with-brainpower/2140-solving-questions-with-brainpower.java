class Solution {
    public long mostPoints(int[][] questions) {
        int[] dp = new int[questions.length+1];
        Arrays.fill(dp,-1);
        return ways(questions,0,dp);

        
    }
    public int ways(int[][] questions, int index, int[] dp){
        if(index>=questions.length) return 0;
        if(dp[index]!=-1) return dp[index];
        int pick = questions[index][0]+ ways(questions,index+questions[index][1]+1,dp);
        int skip = ways(questions,index+1,dp);
        dp[index]  = Math.max(pick,skip);
        
        return dp[index];

    }
    
}