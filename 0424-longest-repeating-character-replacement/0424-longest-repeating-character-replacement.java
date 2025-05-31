class Solution {
    public int characterReplacement(String s, int k) {
        Map<Character,Integer> mp = new HashMap<>();
        int left = 0;
        int right = 0;
        int maxFreq = 0;
        int res = 0;
        while(right<s.length()){
            char ch = s.charAt(right);
            mp.put(ch,mp.getOrDefault(ch,0)+1);
            maxFreq = Math.max(maxFreq,mp.get(ch));
            while((right-left+1 )-maxFreq > k){
                char c = s.charAt(left);
                mp.put(c, mp.get(c)-1);
                left++;
            }
            res = Math.max(res,right-left+1);
            right++;
        }
        return res;
    }
}