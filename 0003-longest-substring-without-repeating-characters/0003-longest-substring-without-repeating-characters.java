class Solution {
    public int lengthOfLongestSubstring(String s) {
        ArrayList<Character> l = new ArrayList<>();
        int max = 0; 
        for (char c : s.toCharArray()) {
            if (l.contains(c)) {
                max = Math.max(max, l.size());
                while (l.contains(c)) {
                    l.remove(0);
                }
            }
            l.add(c);
        }
        max = Math.max(max, l.size());
        return max;
    }
}