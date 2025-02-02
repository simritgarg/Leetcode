class Solution {
    public int strStr(String haystack, String needle) {
        if(haystack.length()<needle.length()) return -1;
        int j=0;
        for(int i=0;i<haystack.length();i++){
            if(haystack.charAt(i)==needle.charAt(j)){
                j++;
            }
            else{
                i=i-j;
                j=0;
            }
            if(j==needle.length()) return i-needle.length()+1;
        }

        return -1;
    }
}