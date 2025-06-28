class Solution {
    public int longestSubsequence(String s, int k) {
        if(s.length() == 0){
            return 0;
        }
        int zerocount = 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '0'){
                zerocount++;
            }
        }
        int maxLength = 0;
        long power = 1;
        long value = 0;

        for(int i=s.length()-1; i>=0; i--){
            char ch = s.charAt(i);
            if(ch == '1'){
                if(power + value <= k){
                    value += power;
                    maxLength++;
                }
            }
            power *= 2;
            if(power > (long)k){
                break;
            }

        }
        return zerocount + maxLength;
    }
}



