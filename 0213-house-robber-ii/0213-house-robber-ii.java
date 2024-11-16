class Solution {
    // public int rob(int[] nums) {
    //     int[] dp = new int[nums.length];
    //     Arrays.fill(dp,-1);
    //     return robbery(nums,nums.length,dp);
        
    // }
    // public int robbery(int[] nums, int index, int[] dp){

    // }


    //TABULATiON
    public int rob(int[] nums) {
        if(nums.length == 1) return nums[0];
        return Math.max(robbery(nums,0,nums.length-2), robbery(nums,1,nums.length-1));
    }

    public int robbery(int[] nums, int start, int end){
        int prevRob = 0;
        int maxRob = 0;
        for(int i=start;i<=end;i++){
            int temp = Math.max(maxRob,prevRob + nums[i]);
            prevRob = maxRob;
            maxRob = temp;

        }
        return maxRob;
    }
}