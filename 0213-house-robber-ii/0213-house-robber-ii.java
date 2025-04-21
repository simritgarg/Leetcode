class Solution {
    //MEMOIZATION
    public int rob(int[] nums) {
        if (nums.length == 1) return nums[0];
        int[] dp1 = new int[nums.length];
        Arrays.fill(dp1, -1);
        int max1 = robbery(nums, 0, nums.length - 2, dp1);
        int[] dp2 = new int[nums.length];
        Arrays.fill(dp2, -1);
        int max2 = robbery(nums, 1, nums.length - 1, dp2);
        return Math.max(max1, max2);
        
    }
    public int robbery(int[] nums, int start, int end , int[] dp){
         if(start>end) return 0;
        if(dp[start]!=-1) return dp[start];

        int pick = robbery(nums,start+2,end,dp)+ nums[start];
        int skip = robbery(nums,start+1,end,dp);

        return dp[start]= Math.max(pick,skip);

    }


    //TABULATiON
    // public int rob(int[] nums) {
    //     if(nums.length == 1) return nums[0];
    //     return Math.max(robbery(nums,0,nums.length-2), robbery(nums,1,nums.length-1));
    // }

    // public int robbery(int[] nums, int start, int end){
    //     int prevRob = 0;
    //     int maxRob = 0;
    //     for(int i=start;i<=end;i++){
    //         int temp = Math.max(maxRob,prevRob + nums[i]);
    //         prevRob = maxRob;
    //         maxRob = temp;

    //     }
    //     return maxRob;
    // }
}