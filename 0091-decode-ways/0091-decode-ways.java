import java.util.*;

class Solution {
    public int numDecodings(String s) {
        if (s == null || s.length() == 0) return 0;
        int[] dp = new int[s.length()];
        Arrays.fill(dp, -1);  // Correct way to initialize the dp array
        return ways(s, 0, dp);
    }
    
    public int ways(String s, int index, int[] dp) {
        if (index == s.length()) return 1;  // Base case: successfully decoded entire string
        if (s.charAt(index) == '0') return 0;  // No valid decoding for substring starting with '0'
        if (dp[index] != -1) return dp[index];  // Return cached result if available
        
        int res = ways(s, index + 1, dp);  // Single character decoding

        // Check two-character decoding, if within bounds and valid (10-26)
        if (index < s.length() - 1) {
            int temp = Integer.parseInt(s.substring(index, index + 2));
            if (temp <= 26) {
                res += ways(s, index + 2, dp);
            }
        }

        dp[index] = res;  // Store the result in dp array
        return dp[index];
    }
}
