class Solution {
    public int lengthOfLastWord(String s) {
        String[] str = s.split(" ");
        String st = str[str.length-1];
        int max = st.length();
        return max;
    }
}