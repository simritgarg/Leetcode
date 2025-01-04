class Solution {
    public int lengthOfLongestSubstring(String s) {
        ArrayList<Character> list = new ArrayList<>();
        int max = 0; 
        for (char c : s.toCharArray()) {
            if (list.contains(c)) {
                maxLength = Math.max(maxLength, list.size());
                while (list.contains(c)) {
                    list.remove(0);
                }
            }
            list.add(c);
        }
        maxLength = Math.max(maxLength, list.size());

        return maxLength;
    }
}