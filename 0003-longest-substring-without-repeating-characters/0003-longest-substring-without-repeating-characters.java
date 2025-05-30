class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> st = new HashSet<>();
        int res = 0;
        int left = 0;
        int right = 0;
        while(right<s.length()){
            while(st.contains(s.charAt(right))){
                st.remove(s.charAt(left));
                left++;
            }
                st.add(s.charAt(right));
                res = Math.max(res,st.size());
                right++;
        }
        return res;
    }
}