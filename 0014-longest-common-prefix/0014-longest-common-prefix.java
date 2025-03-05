class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        if (strs.length == 1) return strs[0];

        Arrays.sort(strs);
        String s1 = strs[0];
        String s2 = strs[strs.length-1];
        // String s = "";
        StringBuilder s = new StringBuilder();
        for(int i=0; i<Math.min(s1.length(), s2.length()) ;i++){
            if(s1.charAt(i) == s2.charAt(i)) {
                // s += s1.charAt(i);
                s.append(s1.charAt(i));
            }
            else break;
        }
        return s;
        
    }
}