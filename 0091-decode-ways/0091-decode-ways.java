import java.util.*;

class Solution {
    public int numDecodings(String s) {
        if (s == null || s.length() == 0) return 0;
        int[] dp = new int[s.length()];
        Arrays.fill(dp, -1);  
        return ways(s, 0, dp);
    }
    
    public int ways(String s, int index, int[] dp) {
        if (index == s.length()) return 1;  
        if (s.charAt(index) == '0') return 0;  
        if (dp[index] != -1) return dp[index]; 
        
        int res = ways(s, index + 1, dp);  

        
        if (index < s.length() - 1) {
            int temp = Integer.parseInt(s.substring(index, index + 2));
            if (temp <= 26) {
                res += ways(s, index + 2, dp);
            }
        }

        dp[index] = res;  
        return dp[index];
    }
}
