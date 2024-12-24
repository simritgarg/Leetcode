class Solution {
    public boolean canPartition(int[] nums) {
        int sum = 0 ;
        for(int i: nums){
            sum += i;
        }
        if(sum%2!=0) return false;
        int totalSum = sum/2;
        Boolean[][] dp = new Boolean[nums.length+1][totalSum+1];
        if(checkPartition(nums,0,totalSum,dp)) return true;
        else return false;
    }
    public Boolean checkPartition(int[] nums, int idx, int totalSum, Boolean[][]dp){
        if(totalSum==0) return true;
        if(idx == nums.length) return false;
        if(dp[idx][totalSum]!=null) return dp[idx][totalSum];
        Boolean pick = false;
        if(nums[idx]<=totalSum){
            pick = checkPartition(nums,idx+1,totalSum-nums[idx],dp);
        }
        Boolean skip = checkPartition(nums,idx+1,totalSum,dp);
        return dp[idx][totalSum] = pick||skip;
        
    }
}