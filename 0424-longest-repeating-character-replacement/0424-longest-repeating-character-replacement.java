class Solution {
    public int characterReplacement(String s, int k) {
        int[] freq = new int[26];
        int maxLen = 0;
        int maxFreq = 0;
        int i=0;
        for(int j=0;j<s.length();j++){
            freq[s.charAt(j)-'A']++;
            maxFreq = Math.max(maxFreq,freq[s.charAt(j)-'A']);
            int windowLen = j-i+1;
            if(windowLen-maxFreq>k){
                freq[s.charAt(i)-'A']--;
                i++;
                
            }
            windowLen = j-i+1;
            maxLen = Math.max(maxLen,windowLen);

        }
        return maxLen;
    }
}