class Solution {
    public int findMaxForm(String[] strs, int m, int n) {
        int[][][] dp = new int[strs.length+1][m+1][n+1];
        for (int i = 0; i < strs.length + 1; i++) {
            for (int j = 0; j < m + 1; j++) {
                Arrays.fill(dp[i][j], -1);
            }
        }

        return largestSubset(strs,m,n,0,dp);
    }
    public int largestSubset(String[] strs, int m, int n, int index, int[][][] dp){
        //base conditions
        if(m<0 || n<0) return -1;
        if(index==strs.length) return 0;

        // storing ele fetching
        if(dp[index][m][n] != -1) return dp[index][m][n];

        // counting zeroes and ones
        int zeroes = countZeroes(strs[index]);
        int ones = strs[index].length()-zeroes;

        int pick = 1 + largestSubset(strs,m-zeroes,n-ones,index+1,dp);
        int skip = largestSubset(strs,m,n,index+1,dp);

        return dp[index][m][n] = Math.max(pick,skip);
    }
    public int countZeroes(String str){
        int count = 0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='0') count++;
        }
        return count;

    }
    

}