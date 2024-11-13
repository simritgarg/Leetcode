class Solution {

    // without DP
    // public int maxUncrossedLines(int[] nums1, int[] nums2) {
    //     return lines(nums1,nums2,0,0);
        
    // }
    // public int lines(int[] nums1, int[] nums2, int i, int j){
    //     if(i==nums1.length || j== nums2.length) return 0;
    //     if(nums1[i]==nums2[j]){
    //         return 1 + lines(nums1,nums2,i+1,j+1);
    //     }
    //     else{
    //         int a = lines(nums1, nums2, i, j+1);
    //         int b = lines(nums1, nums2, i+1, j);
    //         return Math.max(a,b);
    //     }
    // }

    //with DP
    public int maxUncrossedLines(int[] nums1, int[] nums2) {
        int[][] dp = new int[nums1.length+1][nums2.length+1];
        for(int[] t: dp){
            Arrays.fill(t,-1);
        }
        return lines(nums1,nums2,0,0,dp);
        
    }
    public int lines(int[] nums1, int[] nums2, int i, int j, int[][] dp){
        if(i==nums1.length || j== nums2.length) return 0;
        if(dp[i][j] !=-1) return dp[i][j];
        int res = 0;
        if(nums1[i]==nums2[j]){
            res =  1 + lines(nums1,nums2,i+1,j+1,dp);
        }
        else{
            int a = lines(nums1, nums2, i, j+1,dp);
            int b = lines(nums1, nums2, i+1, j,dp);
            res =  Math.max(a,b);
        }
        dp[i][j] = res;
        return dp[i][j];
    }
    
}