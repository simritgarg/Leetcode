class Solution {
    public boolean rotateString(String s, String goal) {
        
        if (s.length() != goal.length()) return false;

        // Method - 1
        // String str = s.concat(s);
        // return str.contains(goal);

        //method - 2 (substring concept)
        // String str = s;
        // for (int i = 0; i < s.length(); i++) {
        //     str = str.substring(1) + str.charAt(0);
        //     if (str.equals(goal)) return true;
        // }
        // return false;

        // Method - 3 (strings)
        StringBuilder str = new StringBuilder(s);
        for (int i = 0; i < s.length(); i++) {
            str.append(str.charAt(0)).deleteCharAt(0);
            if (str.toString().equals(goal)) return true;
        }
        return false;
    }
}