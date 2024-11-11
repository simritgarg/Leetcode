class Solution {
    public int minDistance(String word1, String word2) {
        int[][] dp = new int[word1.length()+1][word2.length()+1];
        for(int[] i : dp){
            Arrays.fill(i,-1);
        }
        return operations(word1,word2,0,0,dp);
        
    }
    public int operations(String word1, String word2, int i, int j, int[][] dp){
        // int count=0;
        // if(i>word1.length() || j>word2.length()) return 0;
        // if(i<word1.length() && j>=word2.length()) return 0;
        // if(i>word1.length() && j<=word2.length()) count++;
        if (i == word1.length()) return word2.length() - j;
        if (j == word2.length()) return word1.length() - i;
        if(dp[i][j]!=-1) return dp[i][j];
        if(word1.charAt(i) == word2.charAt(j)){
            dp[i][j] = operations(word1, word2, i + 1, j + 1, dp);
        }
        else{
            int first = operations(word1,word2,i,j+1,dp)+1;
            int second = operations(word1,word2,i+1,j,dp)+1;
            int third = operations(word1,word2,i+1,j+1,dp)+1;
            dp[i][j] = Math.min(first,Math.min(second,third));
        }
        return dp[i][j];


    }
}