class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        String longest = strs[0];
        for (String str : strs) {
            if (str.length() > longest.length()) {
                longest = str;
            }
        }
        int n = longest.length();
        int[] match = new int[n];
        for (int i = 0; i < n; i++) {
            char ch = longest.charAt(i);
            boolean isCommon = true;

            for (String str : strs) {
                if (i >= str.length() || str.charAt(i) != ch) {
                    isCommon = false;
                    break;
                }
            }
            if (isCommon) {
                match[i] = 1;
            } else {
                break; 
            }
        }
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (match[i] == 1) {
                result.append(longest.charAt(i));
            } else {
                break;
            }
        }

        return result.toString();
    }
}