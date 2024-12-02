class Solution {

    // //MEMOIZATION
    // public int rob(int[] nums) {
    //     int[] dp = new int[nums.length];
    //     Arrays.fill(dp,-1);
    //     return MaximumRobbery(nums,nums.length-1,dp);
    // }
    // public int MaximumRobbery( int[] nums, int index, int[] dp){
    //     if(index == 0) return nums[index];
    //     if(index < 0) return 0;
    //     if(dp[index]!=-1) return dp[index];
    //     int pick = nums[index] + MaximumRobbery(nums,index-2,dp);
    //     int skip = MaximumRobbery(nums,index-1,dp);
    //     return dp[index] = Math.max(pick,skip);
    // }

    // TABULATION
    // public int rob(int[] nums) {
    //     int[] dp = new int[nums.length];
    //     dp[0] = nums[0];
    //     int neg = 0;
    //     for(int i=1;i<nums.length;i++){
    //         int pick = nums[i];
    //         if(i>1)  pick += dp[i-2];
    //         int skip = dp[i-1];
    //         dp[i] = Math.max(pick,skip);
    //     }   
    //     return dp[nums.length-1];     
    // }


    public int rob(int[] nums){
        int n = nums.length;
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        return MaxRob(nums,n-1,dp);
    }
    public int MaxRob(int[] nums, int n, int[] dp){
        if(n==0) return nums[n];
        if(n<0) return 0;
        if(dp[n]!=-1) return dp[n];
        int pick = nums[n] + MaxRob(nums,n-2,dp);
        int skip = MaxRob(nums,n-1,dp);
        return dp[n] = Math.max(pick,skip);
    }
}