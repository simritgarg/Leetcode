class Solution {
    public int beautySum(String s) {
        int n = s.length();
        int beautySum = 0;

        // Iterate over all possible starting points of substrings
        for (int start = 0; start < n; start++) {
            int[] freq = new int[26]; // Frequency array for characters in the current window
            
            for (int end = start; end < n; end++) {
                // Update frequency for the current character
                char c = s.charAt(end);
                freq[c - 'a']++;

                // Calculate max and min frequencies dynamically
                int maxFreq = 0;
                int minFreq = Integer.MAX_VALUE;
                for (int f : freq) {
                    if (f > 0) {
                        maxFreq = Math.max(maxFreq, f);
                        minFreq = Math.min(minFreq, f);
                    }
                }

                // Add the beauty of this substring to the total
                beautySum += (maxFreq - minFreq);
            }
        }

        return beautySum;
    }
}
